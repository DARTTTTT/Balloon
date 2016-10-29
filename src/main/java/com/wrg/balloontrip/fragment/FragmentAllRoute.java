package com.wrg.balloontrip.fragment;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qf.kenlibrary.base.BaseFragment;
import com.wrg.balloontrip.R;
import com.wrg.balloontrip.entity.DaysEntity;

import java.util.List;

/**
 * Created by Administrator on 2016/10/5 0005.
 * Author by RuiGan
 */

public class FragmentAllRoute extends BaseFragment {

    private LinearLayout llall;
    private int count = 0;

    private FragmentInteraction listener;
    private List<DaysEntity.DataBean.DaysBean> days;

    public FragmentAllRoute() {

    }

    /**
     * 当FRagmen被加载到activity的时候会被回调
     *
     * @param activity
     */
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        if (activity instanceof FragmentInteraction) {
            listener = (FragmentInteraction) activity;
        } else {
            throw new IllegalArgumentException("activity must implements FragmentInteraction");
        }

    }

    @Override
    public void onDetach() {
        super.onDetach();

        listener = null;
    }


    @Override
    protected int getContentId() {
        return R.layout.fragment_allroute;
    }

    @Override
    protected void init(View view) {
        llall = (LinearLayout) view.findViewById(R.id.ll_card);
    }

    @Override
    protected void loadDatas() {
        Bundle bundle = getArguments();
        days = (List<DaysEntity.DataBean.DaysBean>) bundle.getSerializable("days");
        llall.removeAllViews();
        LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(120, 120);
        layout.setMargins(10, 0, 10, 10);

        for (int i = 0; i <days.size(); i++) {
            //天数
            //position = days.get(i).getPosition();

            LinearLayout llHtab = new LinearLayout(getActivity());
            llHtab.setGravity(Gravity.CENTER);
            llHtab.setOrientation(LinearLayout.HORIZONTAL);
            TextView textdays = new TextView(getActivity());//大的天数
            textdays.setText("DAY" + days.get(i).getPosition());
            textdays.setTextColor(Color.parseColor("#2ec9d7"));
            llHtab.setBackgroundColor(Color.WHITE);
            //大的天数DAY 1 2 3 4监听
            final int day = i;
            Log.d("print", "天数是多少onClick: "+day);

            llHtab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.process(day);
                    Log.d("print", "天数是下标是----------onClick: "+day);
                }
            });

            textdays.setGravity(Gravity.CENTER);
            textdays.setTextSize(18);
            llHtab.addView(textdays);
            llall.addView(llHtab, layout);
            for (int j = 0; j < days.get(i).getPoints().size(); j++) {

                final int position = days.get(i).getPoints().get(j).getPosition();
                LinearLayout llVtab = new LinearLayout(getActivity());
                llVtab.setGravity(Gravity.CENTER);
                llVtab.setOrientation(LinearLayout.VERTICAL);
                TextView textNum = new TextView(getActivity());
                textNum.setText(++count + "");
                textNum.setGravity(Gravity.CENTER);
                TextView textName = new TextView(getActivity());
                llVtab.setBackgroundColor(Color.WHITE);
                textName.setText(days.get(i).getPoints().get(j).getPoi().getName());
                textName.setGravity(Gravity.CENTER);
                llVtab.addView(textNum);
                llVtab.addView(textName);
                llVtab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            listener.processChild(position);
                    }
                });
                llall.addView(llVtab, layout);


            }
            llall.getChildAt(0).performClick();//模拟点击解决先点小的布局出现空指针
        }
    }


    public interface FragmentInteraction {
        /**
         * Fragment 向Activity传递指令
         *
         * @param
         */
        void process(int day);

        void processChild(int position);

    }
}
