package com.wrg.balloontrip.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.wrg.balloontrip.R;
import com.wrg.balloontrip.entity.DaysEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/5 0005.
 * Author by RuiGan
 */

public class RouteChildAdapter extends BaseAdapter implements View.OnClickListener {

    private Context context;
    private List<DaysEntity.DataBean.DaysBean.PointsBean> datas;
    private int nowPosition=-1;

    public RouteChildAdapter(Context context) {
        this.context = context;
        datas = new ArrayList<>();


    }

    public RouteChildAdapter setData(List<DaysEntity.DataBean.DaysBean.PointsBean> data) {
        this.datas = data;
        this.notifyDataSetChanged();
        return this;

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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_child_gridviewroute_layout, null);
            viewHolder.gd_route_title = (TextView) convertView.findViewById(R.id.gd_route_title);
            viewHolder.gd_route_tips = (TextView) convertView.findViewById(R.id.gd_route_tips);
            viewHolder.gd_route_introduce = (TextView) convertView.findViewById(R.id.gd_route_introduce);
            viewHolder.gd_route_cover = (ImageView) convertView.findViewById(R.id.gd_route_cover);
            viewHolder.route_ll_layout = (LinearLayout) convertView.findViewById(R.id.route_ll_layout);
            convertView.setTag(viewHolder);
        }

        viewHolder.gd_route_title.setText(datas.get(position).getInspiration_activity().getTopic());
        viewHolder.gd_route_tips.setText("建议玩" + datas.get(position).getInspiration_activity().getVisit_tip());
        viewHolder.gd_route_introduce.setText(datas.get(position).getInspiration_activity().getIntroduce());
        Glide.with(context).load(datas.get(position).getInspiration_activity().getPhoto().getPhoto_url()).diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop().into(viewHolder.gd_route_cover);

        viewHolder.llall_listener= (LinearLayout) convertView.findViewById(R.id.llall_listener);
        /**
         * 直接设置小的listview的
         */
        viewHolder.llall_listener.setOnClickListener(this);
        viewHolder.llall_listener.setTag(position);
        viewHolder.route_ll_layout.setVisibility(nowPosition ==position  ? View.VISIBLE : View.GONE);//隐藏的地方
        /**
         * 隐藏相应的
         */


        return convertView;
    }

    @Override
    public void onClick(View v) {
        int thisTag= (int) v.getTag();
        if ( nowPosition== thisTag) {
            nowPosition = -1;
        } else {
            nowPosition = thisTag;
        }
        notifyDataSetChanged();
    }

    class ViewHolder {
        TextView gd_route_title, gd_route_tips, gd_route_introduce;
        ImageView gd_route_cover;
        LinearLayout route_ll_layout,llall_listener;

    }


}
