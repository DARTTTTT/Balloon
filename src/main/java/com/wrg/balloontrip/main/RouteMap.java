package com.wrg.balloontrip.main;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.InfoWindow;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.OverlayOptions;
import com.baidu.mapapi.map.Polyline;
import com.baidu.mapapi.map.PolylineOptions;
import com.baidu.mapapi.model.LatLng;
import com.qf.kenlibrary.base.BaseActivity;
import com.wrg.balloontrip.R;
import com.wrg.balloontrip.entity.DaysEntity;
import com.wrg.balloontrip.fragment.FragmentAllRoute;
import com.wrg.balloontrip.fragment.FragmentCityRoute;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by Administrator on 2016/10/5 0005.
 * Author by RuiGan
 */

public class RouteMap extends BaseActivity implements RadioGroup.OnCheckedChangeListener, FragmentAllRoute.FragmentInteraction {
    private List<DaysEntity.DataBean.DaysBean> days;
    @BindView(R.id.map_rg)
    RadioGroup map_rg;
    private FragmentManager fragmentManger;
    MapView mMapView = null;
    BaiduMap mBaiduMap = null;


    private double blat;
    private double blng;
    private List<DaysEntity.DataBean.DaysBean.PointsBean> points;


    @Override
    protected int getContentId() {
        SDKInitializer.initialize(getApplicationContext());
        return R.layout.activity_routemap;
        // 开启定位图层
    }


    /**
     * 百度地图
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        mMapView.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
        mMapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
        mMapView.onPause();
    }


    @Override
    public void process(int day) {
        Log.d("print", "接口回调的: " + days);

        showDay(day);
     /*   if (days != null) {
            for (int i = 0; i < days.size(); i++) {
                for (int j = 0; j < days.get(i).getPoints().size(); j++) {
                    blat = days.get(i).getPoints().get(j).getPoi().getBlat();
                    Log.d("print", "经度-----------process: " + blat);
                    blng = days.get(i).getPoints().get(j).getPoi().getBlng();
                    Log.d("print", "process: " + blng);

                    setMarker(blat, blng);
                }
            }
            setLocate(lblat, lblng);
        }*/
    }

    /**
     *
     * @param day
     */
    public void showDay(int day) {
        points = days.get(day).getPoints();

        Log.d("print", "天数啊啊啊啊啊啊啊啊啊showDayPoint: " + points);
        //计算当天行程点的开头结尾下标
        int start = 0;
        int end;
        List<LatLng> list = new ArrayList<>();
        for (int i = 0; i < day; i++) {
            start += days.get(i).getPoints().size();
            Log.d("print", "开始showDayPoint: " + start);
        }
        end = start + days.get(day).getPoints().size();
        Log.d("print", "结束showDayPoint: " + end);
        //Maker所需要显示的View
        for (int i = 0; i < points.size(); i++) {
            setLocate(points.get(i).getPoi().getLat(), points.get(i).getPoi().getLng());
            setMarker(points.get(i).getPoi().getLat(), points.get(i).getPoi().getLng());
            //添加点到集合
            LatLng latLng = new LatLng(points.get(i).getPoi().getLat(), points.get(i).getPoi().getLng());
            list.add(latLng);
        }
        drawLine(list);

    }

    /***
     * 画线的方法
     *
     * @param latLngs
     */
    public void drawLine(List<LatLng> latLngs) {
        OverlayOptions overlayOptions = new PolylineOptions().width(5).color(Color.RED).points(latLngs);

        Polyline polyline = (Polyline) mBaiduMap.addOverlay(overlayOptions);
        mBaiduMap.addOverlay(overlayOptions);
    }

    /**
     * 接口回调传来的小天数
     *
     * @param position
     */
    @Override
    public void processChild(int position) {
        final String topic = points.get(position).getInspiration_activity().getTopic();
        Log.d("print", "话题processChild: " + topic);
        final String name = points.get(position).getInspiration_activity().getDestination().getName();
        final String visit_tip = points.get(position).getInspiration_activity().getVisit_tip();
        Log.d("print", "建议processChild: " + visit_tip);
        final double lat = points.get(position).getPoi().getLat();

        Log.d("print", "-----------hhhprocessChild: " + lat);
        final double lng = points.get(position).getPoi().getLng();

        String poi_type = points.get(position).getPoi().getPoi_type();

        Log.d("print", "------------hhhprocessChild: " + lng);
        Log.d("print", "相应天数的-------processChild: " + position);
        showWindow(lat, lng, topic, visit_tip, name, poi_type);

    }

    /**
     * 标记跳出pupwindow
     * @param sblat
     * @param sblng
     * @param topic
     * @param visit_tip
     * @param name
     * @param poi_type
     */
    public void showWindow(double sblat, double sblng, String topic, String visit_tip, String name, String poi_type) {

        //创建InfoWindow展示的view
        View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.item_map_window, null);
        TextView title = (TextView) view.findViewById(R.id.window_title);
        TextView destion = (TextView) view.findViewById(R.id.window_destion);
        TextView tips = (TextView) view.findViewById(R.id.window_tips);
        ImageView cover = (ImageView) view.findViewById(R.id.window_iv);
        title.setText(topic);
        Log.d("print", "话题----showWindow: " + topic);
        tips.setText("建议玩" + visit_tip);
        destion.setText(name + "·");
        Log.d("print", "建议----showWindow: " + visit_tip);

        switch (poi_type) {
            case "SIGHT":
                cover.setImageDrawable(getResources().getDrawable(R.mipmap.icon_plan_scenery));
                break;
            case "RESTAURANT":
                cover.setImageDrawable(getResources().getDrawable(R.mipmap.icon_plan_hotel));
                break;
            case "ENTERTAINMENT":
                cover.setImageDrawable(getResources().getDrawable(R.mipmap.icon_plan_food));
                break;

        }

        //定义用于显示该InfoWindow的坐标点
        LatLng pt = new LatLng(sblat, sblng);
        setLocate(sblat,sblng);
        //创建InfoWindow , 传入 view， 地理坐标， y 轴偏移量
        InfoWindow mInfoWindow = new InfoWindow(view, pt, -47);
        //显示InfoWindow
        mBaiduMap.showInfoWindow(mInfoWindow);

    }

    @Override
    protected void init() {


        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bundle");
        days = (List<DaysEntity.DataBean.DaysBean>) bundle.getSerializable("days");
        Log.d("print", "传来的数据: " + days);
        map_rg.setOnCheckedChangeListener(this);
        fragmentManger = getSupportFragmentManager();
        map_rg.getChildAt(0).performClick();
        mMapView = (MapView) findViewById(R.id.bmapView);

        mBaiduMap = mMapView.getMap();


    }

    /**
     * 设置标志的方法
     *
     * @param blat
     * @param blng
     */
    public void setMarker(Double blat, Double blng) {
        //定义Maker坐标点
        LatLng point = new LatLng(blat, blng);
        //构建Marker图标
        BitmapDescriptor bitmap = BitmapDescriptorFactory
                .fromResource(R.mipmap.location_green);
        //构建MarkerOption，用于在地图上添加Marker
        OverlayOptions option = new MarkerOptions()
                .position(point)
                .icon(bitmap);
        //在地图上添加Marker，并显示
        mBaiduMap.addOverlay(option);
    }

    /**
     * 显示天数的总体位置
     *
     * @param blat
     * @param blng
     */
    public void setLocate(Double blat, Double blng) {
        //构建Marker图标
        BitmapDescriptor bitmap = BitmapDescriptorFactory
                .fromResource(R.mipmap.location_green);
        //构建MarkerOption，用于在地图上添加Marker
        MarkerOptions option = new MarkerOptions()
                .position(new LatLng(blat, blng))
                .icon(bitmap)
                .draggable(true);//可拖拽

        // 生长动画
        option.animateType(MarkerOptions.MarkerAnimateType.grow);


        //在地图上添加Marker，并显示
        mBaiduMap.addOverlay(option);

        //设置地图显示的位置
        MapStatus mMapStatus = new MapStatus.Builder()
                .target(new LatLng(blat, blng))//地图显示位置的中心点
                .zoom(18).build();
        MapStatusUpdate mMapStatusUpdate = MapStatusUpdateFactory.newMapStatus(mMapStatus);
        mBaiduMap.setMapStatus(mMapStatusUpdate);
    }

    /**
     * fragment的切换
     * @param group
     * @param checkedId
     */
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        FragmentTransaction fragmentTransaction = fragmentManger.beginTransaction();//开启事务
        switch (checkedId) {
            case R.id.map_rb_all:
                FragmentAllRoute fragmentall = new FragmentAllRoute();
                Bundle bundle = new Bundle();
                bundle.putSerializable("days", (Serializable) days);
                fragmentall.setArguments(bundle);
                fragmentTransaction.replace(R.id.map_zbj, fragmentall).commit();
                break;
            case R.id.map_rb_city:
                FragmentCityRoute fragmentCityRoute = new FragmentCityRoute();
                Bundle bundle1 = new Bundle();
                bundle1.putSerializable("days", (Serializable) days);
                fragmentCityRoute.setArguments(bundle1);
                fragmentTransaction.replace(R.id.map_zbj, fragmentCityRoute).commit();
                break;

        }
    }


}
