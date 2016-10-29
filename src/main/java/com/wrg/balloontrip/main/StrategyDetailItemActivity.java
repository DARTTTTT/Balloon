package com.wrg.balloontrip.main;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.qf.kenlibrary.base.BaseActivity;
import com.wrg.balloontrip.R;

/**
 * Created by Administrator on 2016/10/2 0002.
 * Author by RuiGan
 */

public class StrategyDetailItemActivity extends BaseActivity{

private TextView title;
    @Override
    protected int getContentId() {
        return R.layout.activity_strategydetailitem;
    }

    @Override
    protected void init() {
        title= (TextView) findViewById(R.id.asdi_title);
        Intent intent=getIntent();
        String name = intent.getStringExtra("name");
        Log.d("print", "获得的名字init: "+name);
        title.setText(name+"攻略");
    }

    @Override
    public boolean isOpenStatus() {
        return false;
    }

    public void btnClick(View view){
        switch (view.getId()){
            case R.id.stay_back:
                finish();
                break;
        }

    }
}
