package com.wrg.balloontrip.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.wrg.balloontrip.R;
import com.wrg.balloontrip.entity.DaysEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/5 0005.
 * Author by RuiGan
 */

public class RouteParentAdapter extends BaseAdapter {
    private Context context;
    private List<DaysEntity.DataBean.DaysBean> datas;

    private RouteChildAdapter routeChildAdapter;

    public RouteParentAdapter(Context context) {
        this.context = context;
        datas = new ArrayList<>();

    }

    public void setData(List<DaysEntity.DataBean.DaysBean> data) {
        this.datas = data;
        this.notifyDataSetChanged();

    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_parent_listviewroute_layout, null);
            viewHolder.route_day = (TextView) convertView.findViewById(R.id.route_title);
            viewHolder.route_description = (TextView) convertView.findViewById(R.id.route_description);
            viewHolder.route_name = (TextView) convertView.findViewById(R.id.route_name);//城市名的
            viewHolder.listView = (ListView) convertView.findViewById(R.id.route_gridview);
            convertView.setTag(viewHolder);
        }

        viewHolder.route_name.setText(":" + datas.get(position).getPoints().get(0).getInspiration_activity().getDestination().getName());
        viewHolder.route_day.setText("DAY" + datas.get(position).getPosition());
        viewHolder.route_description.setText(datas.get(position).getDescription());

        routeChildAdapter = new RouteChildAdapter(context);
        routeChildAdapter.setData(datas.get(position).getPoints());
        viewHolder.listView.setAdapter(routeChildAdapter);


        return convertView;
    }




    class ViewHolder {
        TextView route_day, route_description, route_name;
        ListView listView;


    }


}
