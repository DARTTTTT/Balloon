package com.wrg.balloontrip.main;

import android.content.Intent;
import android.widget.ImageView;

import com.qf.kenlibrary.base.BaseActivity;
import com.wrg.balloontrip.R;

import butterknife.BindView;

/**
 * Created by Administrator on 2016/10/8 0008.
 * Author by RuiGan
 */

public class WelcomeActivity extends BaseActivity {
    @BindView(R.id.imageView)
    ImageView iv;
    @Override
    protected int getContentId() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void init() {
        iv.postDelayed(new Runnable() {
            @Override
            public void run() {
            startActivity(new Intent(WelcomeActivity.this,MainActivity.class));
                finish();
            }
        },2000);

    }
}
