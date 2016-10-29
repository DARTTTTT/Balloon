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
import com.wrg.balloontrip.entity.StrategyEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/30 0030.
 * Author by RuiGan
 */

public class ChildGridViewAdapter extends BaseAdapter {
    private Context context;
    private List<StrategyEntity.DataBean.DestinationsBean> datas;



    public ChildGridViewAdapter(Context context){
        this.context=context;
        datas=new ArrayList<>();
    }


    public ChildGridViewAdapter setDatas(List<StrategyEntity.DataBean.DestinationsBean> data){
        this.datas=data;
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
        if (convertView!=null){
            viewHolder= (ViewHolder) convertView.getTag();
        }else {
            viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.item_child_gridview_layout,null);
            viewHolder.fg_name= (TextView) convertView.findViewById(R.id.fghome_name);
            viewHolder.fg_name_en= (TextView) convertView.findViewById(R.id.fghome_name_en);
            viewHolder.fg_photourl= (ImageView) convertView.findViewById(R.id.fghome_photo);
            convertView.setTag(viewHolder);
        }

        viewHolder.fg_name.setText(datas.get(position).getName());
        viewHolder.fg_name_en.setText(datas.get(position).getName_en());
        /**
         * 提示点1
         */
        Glide.with(context).load(datas.get(position).getPhoto_url()).centerCrop().diskCacheStrategy(DiskCacheStrategy.ALL).into(viewHolder.fg_photourl);

        return convertView;
    }

    class ViewHolder {
        ImageView fg_photourl;
        TextView fg_name,fg_name_en;

    }


}
