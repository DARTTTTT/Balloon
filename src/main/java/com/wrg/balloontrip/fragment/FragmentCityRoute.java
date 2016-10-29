package com.wrg.balloontrip.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qf.kenlibrary.base.BaseFragment;
import com.wrg.balloontrip.R;
import com.wrg.balloontrip.entity.DaysEntity;

import java.util.List;

import butterknife.BindView;

/**
 * Created by Administrator on 2016/10/5 0005.
 * Author by RuiGan
 */

public class FragmentCityRoute extends BaseFragment {
    @BindView(R.id.ll_card1)
    LinearLayout lltab;
    @Override
    protected int getContentId() {
        return R.layout.fragment_cityroute;
    }

    @Override
    protected void loadDatas() {
        Bundle bundle=getArguments();
        List<DaysEntity.DataBean.DaysBean> days= (List<DaysEntity.DataBean.DaysBean>) bundle.getSerializable("days");
        lltab.removeAllViews();
        int count=0;

        LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(120, 120);
        layout.setMargins(10, 0, 10, 10);
        for (int i = 0; i <days.size() ; i++) {
            for (int j = 0; j <days.get(i).getPoints().size() ; j++) {
                LinearLayout ll=new LinearLayout(getActivity());
                ll.setGravity(Gravity.CENTER);
                ll.setOrientation(LinearLayout.VERTICAL);
                TextView textname=new TextView(getActivity());
                textname.setGravity(Gravity.CENTER);
                ll.setBackgroundColor(Color.WHITE);
                textname.setText(days.get(i).getPoints().get(j).getInspiration_activity().getDestination().getName());
                TextView texnume=new TextView(getActivity());
                texnume.setGravity(Gravity.CENTER);
                texnume.setText(++count+"");
                ll.addView(texnume);
                ll.addView(textname);
                lltab.addView(ll,layout);
            }
        }

    }
}
