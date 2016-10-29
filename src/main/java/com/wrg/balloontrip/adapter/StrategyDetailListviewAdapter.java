package com.wrg.balloontrip.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.wrg.balloontrip.R;
import com.wrg.balloontrip.entity.StrategyDetailEntity;
import com.wrg.balloontrip.main.RouteActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/3 0003.
 * Author by RuiGan
 */

public class StrategyDetailListviewAdapter extends BaseAdapter implements View.OnClickListener {
    private Context context;
    List<StrategyDetailEntity.DataBean.SectionsBean> data;
    private String title;
    private List<StrategyDetailEntity.DataBean.SectionsBean.ModelsBean.DaysBean> days;
    private int id;


    public StrategyDetailListviewAdapter(Context context) {
        this.context = context;
        data = new ArrayList<>();
    }

    public void setData(List<StrategyDetailEntity.DataBean.SectionsBean> data) {
        this.data = data;
        this.notifyDataSetChanged();
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
        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();

        } else {
            viewHolder = new ViewHolder();
            switch (getItemViewType(position)) {
                case 0://目的地
                    convertView = LayoutInflater.from(context).inflate(R.layout.item_strategy_destinnation, null);
                    viewHolder.btn_title = (TextView) convertView.findViewById(R.id.btn_title0);
                    viewHolder.button_text = (TextView) convertView.findViewById(R.id.button_text0);
                    viewHolder.llmodels = (LinearLayout) convertView.findViewById(R.id.llmodels);
                    break;
                case 1://路线/行程
                    convertView = LayoutInflater.from(context).inflate(R.layout.item_strategy_route, null);
                    viewHolder.btn_title = (TextView) convertView.findViewById(R.id.btn_title1);
                    viewHolder.btn_models_title = (TextView) convertView.findViewById(R.id.btn_models_title);
                    viewHolder.fl_route = (FrameLayout) convertView.findViewById(R.id.fl_route);//帧布局的
                    viewHolder.radioGroup = (RadioGroup) convertView.findViewById(R.id.route_rg);

                    break;
                case 2://榜单
                    convertView = LayoutInflater.from(context).inflate(R.layout.item_strategy_example, null);
                    viewHolder.btn_title = (TextView) convertView.findViewById(R.id.btn_title2);
                    viewHolder.button_text = (TextView) convertView.findViewById(R.id.button_text2);
                    viewHolder.example_lv = (ListView) convertView.findViewById(R.id.example_lv);//榜单中是一个listview

                    break;
                case 3://氢游记
                    convertView = LayoutInflater.from(context).inflate(R.layout.item_strategy_abouttrip, null);
                    viewHolder.btn_title = (TextView) convertView.findViewById(R.id.btn_title3);
                    viewHolder.button_text = (TextView) convertView.findViewById(R.id.button_text3);
                    viewHolder.models_content_photo = (ImageView) convertView.findViewById(R.id.models_content_photo);
                    viewHolder.models_user_name = (TextView) convertView.findViewById(R.id.models_user_name);
                    viewHolder.models_content_topic = (TextView) convertView.findViewById(R.id.models_content_topic);
                    viewHolder.models_content_description = (TextView) convertView.findViewById(R.id.models_content_description);
                    break;


            }
            convertView.setTag(viewHolder);
        }


        switch (getItemViewType(position)) {

            case 0:
                viewHolder.btn_title.setText(data.get(position).getTitle());
                viewHolder.button_text.setText(data.get(position).getButton_text());
                viewHolder.llmodels.removeAllViews();
                for (int i = 0; i < data.get(position).getModels().size(); i++) {
                    LinearLayout llall = new LinearLayout(context);
                    llall.setOrientation(LinearLayout.VERTICAL);
                    TextView name = new TextView(context);
                    name.setGravity(Gravity.CENTER_HORIZONTAL);
                    name.setText(data.get(position).getModels().get(i).getName());
                    TextView name_en = new TextView(context);
                    name_en.setText(data.get(position).getModels().get(i).getName_en());
                    name_en.setGravity(Gravity.CENTER_HORIZONTAL);
                    ImageView iv = new ImageView(context);
                    iv.setScaleType(ImageView.ScaleType.CENTER);

                    Glide.with(context).load(data.get(position).getModels().get(i).getPhoto_url()).diskCacheStrategy(DiskCacheStrategy.ALL).into(iv);
                    llall.addView(iv);
                    llall.addView(name);
                    llall.addView(name_en);
                    //把图片的大小设置固定宽高
                    LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(450, 400);
                    layout.setMargins(15, 15, 0, 15);
                    iv.setLayoutParams(layout);

                    viewHolder.llmodels.addView(llall);
                }

                break;
            case 1:
                viewHolder.radioGroup.removeAllViews();
                viewHolder.btn_title.setText(data.get(position).getTitle());
                viewHolder.fl_route.setOnClickListener(this);
                //radiogroup的点击

                for (int i = 0; i < data.get(position).getModels().size(); i++) {
                    RadioButton rb = new RadioButton(context);
                    rb.setText(data.get(position).getModels().get(i).getDays_count() + "日行程");
                    rb.setGravity(Gravity.CENTER);
                    rb.setButtonDrawable(null);
                    rb.setBackground(context.getResources().getDrawable(R.drawable.selector_route_button));
                    LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(200, ViewGroup.LayoutParams.WRAP_CONTENT);
                    layout.setMargins(10, 10, 0, 10);
                    viewHolder.radioGroup.addView(rb, layout);


                }

                viewHolder.btn_models_title.setText(data.get(position).getModels().get(0).getTitle());
                title = data.get(position).getModels().get(0).getTitle();
                id = data.get(position).getModels().get(0).getId();
                //days = data.get(position).getModels().get(0).getDays();

                break;
            case 2:
                viewHolder.btn_title.setText(data.get(position).getTitle());
                viewHolder.button_text.setText(data.get(position).getButton_text());
                viewHolder.example_lv.setAdapter(new BanddanAdapter(context).setData(data.get(position).getModels()));
                break;
            case 3:
                viewHolder.btn_title.setText(data.get(position).getTitle());
                viewHolder.button_text.setText(data.get(position).getButton_text());
                viewHolder.models_content_topic.setText(data.get(position).getModels().get(0).getTopic());
                viewHolder.models_user_name.setText(data.get(position).getModels().get(0).getUser().getName());
                viewHolder.models_content_description.setText(data.get(position).getModels().get(0).getDescription());
                Glide.with(context).load(data.get(position).getModels().get(0).getContents().get(0).getPhoto_url()).diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop().into(viewHolder.models_content_photo);
                break;


        }


        return convertView;
    }

    /**
     * 行程的点击事件
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, RouteActivity.class);
        Bundle bundle = new Bundle();
        //bundle.putSerializable("days", (Serializable) days);
        bundle.putString("title", title);
        bundle.putInt("id", id);
        intent.putExtra("bundle", bundle);
        context.startActivity(intent);
    }


    class ViewHolder {
        TextView btn_title, button_text, btn_models_title, models_user_name, models_content_topic, models_content_description, models_content_title, models_content_summary;

        LinearLayout llmodels;
        ImageView models_content_photo;
        ListView example_lv;
        FrameLayout fl_route;//帧布局的
        RadioGroup radioGroup;
    }

    @Override
    public int getItemViewType(int position) {

        return Integer.parseInt(data.get(position).getType());
    }

    @Override
    public int getViewTypeCount() {
        Log.d("print", "getViewTypeCount: " + data.size());
        return 4;//这里是显示相应页面有多少种布局
    }

}