package com.wrg.balloontrip.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.wrg.balloontrip.R;
import com.wrg.balloontrip.entity.StrategyDetailEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/4 0004.
 * Author by RuiGan
 */

public class BanddanAdapter extends BaseAdapter {
    private Context context;
    private List<StrategyDetailEntity.DataBean.SectionsBean.ModelsBean>data;

    public BanddanAdapter(Context context) {
        this.context = context;
        data = new ArrayList<>();

    }

    public BanddanAdapter setData(List<StrategyDetailEntity.DataBean.SectionsBean.ModelsBean> data) {
        this.data = data;
        this.notifyDataSetChanged();
        return this;

    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView!=null){
            viewHolder= (ViewHolder) convertView.getTag();
        }else {
            viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.item_strategy_example_bangdan_layout,null);
            viewHolder.models_content_title = (TextView) convertView.findViewById(R.id.models_content_title);
            viewHolder.models_content_summary = (TextView) convertView.findViewById(R.id.models_content_summary);
            viewHolder.models_cover = (ImageView) convertView.findViewById(R.id.models_cover);
            convertView.setTag(viewHolder);
        }


        viewHolder.models_content_title.setText(data.get(position).getTitle());
        viewHolder.models_content_summary.setText(data.get(position).getSummary());
        Glide.with(context).load(data.get(position).getPhoto_url()).diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop().into(viewHolder.models_cover);
        return convertView;
    }

    class ViewHolder{
        TextView  models_content_title, models_content_summary;
        ImageView models_cover;
    }
}
