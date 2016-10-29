package com.wrg.balloontrip.main;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.gson.Gson;
import com.qf.kenlibrary.base.BaseActivity;
import com.qf.kenlibrary.util.DownUtil;
import com.wrg.balloontrip.R;
import com.wrg.balloontrip.adapter.RouteParentAdapter;
import com.wrg.balloontrip.constants.Constants;
import com.wrg.balloontrip.entity.DaysEntity;

import java.io.Serializable;
import java.util.List;

import butterknife.BindView;

/**
 * Created by Administrator on 2016/10/4 0004.
 * Author by RuiGan
 */

public class RouteActivity extends BaseActivity implements DownUtil.OnDownListener, View.OnClickListener {

    @BindView(R.id.route_tile)
    TextView route_title;
  /*  @BindView(R.id.btn_route_title)
    TextView btn_title;*/
    private ListView route_lv;
    private RouteParentAdapter routeParentAdapter;
    private int id;
    private ImageView route_cover;
    private TextView btn_title;
    private DaysEntity data;
    private List<DaysEntity.DataBean.DaysBean> days;


    @Override
    protected int getContentId() {
        return R.layout.activity_route;
    }

    public void btnClick(View view) {
        switch (view.getId()) {
            case R.id.route_back:
                finish();
                break;

        }
    }

    @Override
    protected void init() {

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bundle");


        String title = bundle.getString("title");
        id = bundle.getInt("id");
        Log.d("print", "init: " + id);
        route_title.setText(title);

        route_lv = (ListView) findViewById(R.id.route_parent_lv);

        View views= LayoutInflater.from(this).inflate(R.layout.item_head_layout,null);
        btn_title= (TextView) views.findViewById(R.id.btn_route_title);
        route_lv.addHeaderView(views);
        route_cover = (ImageView)views.findViewById(R.id.route_imageView);
        route_cover.setOnClickListener(this);
    }


    @Override
    protected void loadDatas() {
        String URL_ROUTEDETAIL = String.format(Constants.URL_STRATEGY_ROUTE, id);
        //Log.d("print", "链接的好的: " + URL_ROUTEDETAIL);
        new DownUtil().setOnDownListener(this).downJSON(URL_ROUTEDETAIL);

    }

    @Override
    public Object paresJson(String json) {
        if (json != null) {
            //Log.d("print", "-----------解析json: " + json);
            return new Gson().fromJson(json.toString(), DaysEntity.class);
        }
        return null;
    }

    @Override
    public void downSucc(Object object) {
        if (object != null) {

            data = (DaysEntity) object;
            //背景图片的
            Glide.with(this).load(data.getData().getPhoto().getPhoto_url()).centerCrop().diskCacheStrategy(DiskCacheStrategy.ALL).into(route_cover);
            //Log.d("print", "------------啦啦啦啦downSucc: " + data);
            btn_title.setText(data.getData().getTitle());
            days = data.getData().getDays();
            //Log.d("print", "--------啊啊啊啊啊啊downSucc: " + days);

            routeParentAdapter = new RouteParentAdapter(this);
            routeParentAdapter.setData(days);
            route_lv.setAdapter(routeParentAdapter);

        }
    }


    @Override
    public boolean isOpenStatus() {
        return false;
    }

    /**
     * 图片的跳转
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, RouteMap.class);
        Bundle bundle = new Bundle();
        intent.putExtra("bundle",bundle);
        bundle.putSerializable("days", (Serializable) days);
        startActivity(intent);
    }
}
