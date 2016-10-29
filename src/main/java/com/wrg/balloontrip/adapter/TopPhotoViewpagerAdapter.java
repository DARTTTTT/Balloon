package com.wrg.balloontrip.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.wrg.balloontrip.entity.TopPhotoViewEntity;
import com.wrg.balloontrip.fragment.FragmentTopPhoto;

import java.util.List;

/**
 * Created by Administrator on 2016/9/30 0030.
 * Author by RuiGan
 */

public class TopPhotoViewpagerAdapter extends FragmentPagerAdapter {

private List<TopPhotoViewEntity.DataBean> datas;
    public TopPhotoViewpagerAdapter(FragmentManager fm,List<TopPhotoViewEntity.DataBean> data) {
        super(fm);
        this.datas=data;
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentTopPhoto.getInstance(datas.get(position));
    }

    @Override
    public int getCount() {
        return datas.size();
    }
}
