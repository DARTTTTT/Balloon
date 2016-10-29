package com.wrg.balloontrip.adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.wrg.balloontrip.R;
import com.wrg.balloontrip.entity.TripEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/30 0030.
 * Author by RuiGan
 */

public class TripAdapter extends BaseAdapter {
    private Context context;
    private List<TripEntity.DataBean> datas;


    public TripAdapter(Context context) {
        this.context = context;
        datas = new ArrayList<>();

    }

    public void setDatas(List<TripEntity.DataBean> datas) {
        this.datas = datas;
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
        final ViewHolder viewHolder;
        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_listview_fgtrip, null);
            //用户的头像
            viewHolder.user_photo = (ImageView) convertView.findViewById(R.id.lv_user_photo);
            //内容的大图片
            viewHolder.content_photo = (ImageView) convertView.findViewById(R.id.lv_sights_photocontent);
            //用户昵称
            viewHolder.user_name = (TextView) convertView.findViewById(R.id.lv_user_name);
            //推荐者
            viewHolder.user_recommend = (TextView) convertView.findViewById(R.id.lv_user_reconmend);
            //topic
            viewHolder.content_topic = (TextView) convertView.findViewById(R.id.lv_content_topic);
            //description
            viewHolder.content_description = (TextView) convertView.findViewById(R.id.lv_content_description);
            //动态添加文字的
            viewHolder.districts = (LinearLayout) convertView.findViewById(R.id.lv_districts);
            //喜欢 讨论和收藏
            viewHolder.flikes_count = (TextView) convertView.findViewById(R.id.likes_count);
            viewHolder.fcontents_count = (TextView) convertView.findViewById(R.id.contents_count);
            viewHolder.fcomments_count = (TextView) convertView.findViewById(R.id.comments_count);
            //动态添加图片
            viewHolder.fllcover = (LinearLayout) convertView.findViewById(R.id.llcover);
            //点开全文的按钮
            viewHolder.btnExpand = (Button) convertView.findViewById(R.id.lv_content_expand);

            convertView.setTag(viewHolder);
        }

        viewHolder.user_name.setText(datas.get(position).getActivity().getUser().getName());
        viewHolder.user_recommend.setText(datas.get(position).getUser().getName());
        viewHolder.content_topic.setText(datas.get(position).getActivity().getTopic());
        /**
         * 注意要异步
          */
        viewHolder.content_description.setText(datas.get(position).getActivity().getDescription());
        viewHolder.content_description.post(new Runnable() {
            @Override
            public void run() {
                if (viewHolder.content_description.getLineCount() > 8) {
                    viewHolder.btnExpand.setVisibility(View.VISIBLE);
                    viewHolder.content_description.setMaxHeight(viewHolder.content_description.getLineHeight() * 5+ viewHolder.content_description.getPaddingTop()
                            + viewHolder.content_description.getCompoundPaddingBottom());

                }else {
                    viewHolder.btnExpand.setVisibility(View.GONE);

                }

            }
        });
        viewHolder.content_description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHolder.content_description.post(new Runnable() {
                    @Override
                    public void run() {
                        viewHolder.content_description.setMaxHeight(viewHolder.content_description.getLineHeight() * viewHolder.content_description.getLineCount()
                                + viewHolder.content_description.getCompoundPaddingBottom());
                    }
                });

            }
        });

        Glide.with(context).load(datas.get(position).getActivity().getUser().getPhoto_url()).diskCacheStrategy(DiskCacheStrategy.ALL).into(viewHolder.user_photo);
        Glide.with(context).load(datas.get(position).getActivity().getContents().get(0).getPhoto_url()).centerCrop().into(viewHolder.content_photo);
        viewHolder.flikes_count.setText(datas.get(position).getActivity().getLikes_count() + "");
        viewHolder.fcontents_count.setText(datas.get(position).getActivity().getContents_count() + "");
        viewHolder.fcomments_count.setText(datas.get(position).getActivity().getComments_count() + "");


        //动态添加那一行文字
        viewHolder.districts.removeAllViews();
        for (int i = 1; i < datas.get(position).getActivity().getDistricts().size(); i++) {
            final TextView textview = new TextView(context);
            textview.setText(datas.get(position).getActivity().getDistricts().get(i).getName());
            textview.setPadding(10, 5, 10, 5);
            textview.setGravity(Gravity.CENTER);
            //文字显示的默认高度


            textview.setBackground(context.getResources().getDrawable(R.drawable.text_shape));
            textview.setTextColor(Color.parseColor("#2ec9d7"));
            LinearLayout.LayoutParams layout1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layout1.setMargins(10, 5, 10, 5);
            viewHolder.districts.addView(textview, layout1);
        }

        //动态添加图片的
        viewHolder.fllcover.removeAllViews();
        for (int i = 1; i < datas.get(position).getActivity().getContents().size(); i++) {
            ImageView iv = new ImageView(context);
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
            LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(300, ViewGroup.LayoutParams.MATCH_PARENT);
            layout.setMargins(5, 10, 5, 10);
            Glide.with(context).load(datas.get(position).getActivity().getContents().get(i).getPhoto_url()).into(iv);
            Log.d("print", "getView图片的url: " + datas.get(position).getActivity().getContents().get(i).getPhoto_url());
            viewHolder.fllcover.addView(iv, layout);
        }
        return convertView;
    }

    class ViewHolder {
        ImageView user_photo, content_photo;
        TextView user_name, user_recommend, content_topic, content_description, flikes_count, fcontents_count, fcomments_count;
        LinearLayout districts, fllcover;
        Button btnExpand;
    }
}
