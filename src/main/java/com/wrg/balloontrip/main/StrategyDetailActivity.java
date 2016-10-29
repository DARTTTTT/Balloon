package com.wrg.balloontrip.main;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.gson.Gson;
import com.qf.kenlibrary.base.BaseActivity;
import com.qf.kenlibrary.util.DownUtil;
import com.wrg.balloontrip.R;
import com.wrg.balloontrip.adapter.StrategyDetailListviewAdapter;
import com.wrg.balloontrip.constants.Constants;
import com.wrg.balloontrip.entity.StrategyDetailEntity;

import java.util.List;

/**
 * Created by Administrator on 2016/10/2 0002.
 * Author by RuiGan
 */

public class StrategyDetailActivity extends BaseActivity implements DownUtil.OnDownListener, View.OnClickListener {




    private TextView name, name_en;
    private ImageView iv_bg;

    private int id;

    private LinearLayout llGoods;
    private String type;
    private String sname;


    private StrategyDetailListviewAdapter strategyDetailListviewAdapter;
    private ListView listView;




    @Override
    protected int getContentId() {
        return R.layout.activity_strategydetail;
    }

    @Override
    protected void init() {
        Intent intent = getIntent();
        id = intent.getIntExtra("id", android.R.attr.id);
        Log.d("print", "init: " + id);//这里已获得每个城市id
        name = (TextView) findViewById(R.id.asd_name);
        name_en = (TextView) findViewById(R.id.asd_name_en);
        iv_bg = (ImageView) findViewById(R.id.asd_iv_bg);
        llGoods = (LinearLayout) findViewById(R.id.llgoods);

        listView= (ListView) findViewById(R.id.strategy_lv);
    }

    /**
     *
     */
    @Override
    protected void loadDatas() {
        String URL_STARTEGYDETAIL = String.format(Constants.URL_STRATEGY_DETAIL, id);
        new DownUtil().setOnDownListener(this).downJSON(URL_STARTEGYDETAIL);
    }

    @Override
    public Object paresJson(String json) {
        if (json != null) {
            Log.d("print", "攻略详情的paresJson: " + json);
            return new Gson().fromJson(json.toString(), StrategyDetailEntity.class);
        }
        return null;
    }

    @Override
    public void downSucc(Object object) {
        Log.d("print", "解析好的downSucc: " + object);
        if (object != null) {

            StrategyDetailEntity data = (StrategyDetailEntity) object;
            List<StrategyDetailEntity.DataBean.GoodsBean> goods = data.getData().getGoods();
            type = goods.get(0).getType();
            sname = data.getData().getDestination().getName();
            Log.d("print", "城市的名字downSucc: " + sname);
            String sname_en = data.getData().getDestination().getName_en();
            //背景图片和城市的名称
            Glide.with(getApplicationContext()).load(data.getData().getDestination().getPhoto_url()).diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop().into(iv_bg);
            name.setText(sname);
            name_en.setText(sname_en);
            /**
             * 动态添加攻略等的图片
             */
            for (int i = 0; i < data.getData().getGoods().size(); i++) {
                LinearLayout ll=new LinearLayout(this);
                ll.setOrientation(LinearLayout.VERTICAL);
                ImageView iv = new ImageView(this);
                iv.setScaleType(ImageView.ScaleType.CENTER);
                TextView tv=new TextView(this);
                tv.setText(data.getData().getGoods().get(i).getTitle());
                tv.setPadding(0,20,0,0);
                //每一个图片的点击事件
                Log.d("print", "类型TYPE: " + type);
                ll.addView(iv);
                ll.addView(tv);
                iv.setOnClickListener(this);
                LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layout.setMargins(157, 30, 157, 30);
                Glide.with(this).load(data.getData().getGoods().get(i).getPhoto_url()).diskCacheStrategy(DiskCacheStrategy.ALL).into(iv);

                llGoods.addView(ll,layout);

            }
            /**
             * 大的listview
             */
            List<StrategyDetailEntity.DataBean.SectionsBean> sections = data.getData().getSections();
            strategyDetailListviewAdapter=new StrategyDetailListviewAdapter(this);
            strategyDetailListviewAdapter.setData(sections);
            listView.setAdapter(strategyDetailListviewAdapter);


        }

    }





    //返回键的
    public void btnClick(View view) {
        switch (view.getId()) {
            case R.id.asd_back:
                finish();
                break;
        }
    }

    //每一个图片的监听
    @Override
    public void onClick(View v) {
        switch (type) {
            case "WikiDestination"://攻略
                Intent intent = new Intent(StrategyDetailActivity.this, StrategyDetailItemActivity.class);
                intent.putExtra("name", sname);
                startActivity(intent);
                break;
            case "Hotel"://酒店
            case "AirTicket"://机票
            case "CtripFreeTravel"://自由行
            case "CtripGroupTravel"://跟团游
            case "CtripTicket"://门票
            case "CtripWifi"://无线
            case "CtripVisa"://签证
                startActivity(new Intent(StrategyDetailActivity.this, StrategyDetailItemOtherActivity.class));
                break;
        }
    }

    @Override
    public boolean isOpenStatus() {
        return false;
    }
}
