package com.wrg.balloontrip.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/29 0029.
 * Author by RuiGan
 */

public class MainViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mfragment;//一个fragment的集合
    private List<String> tabs;//一个头部标题的集合
    public MainViewPagerAdapter(FragmentManager fm ) {
        super(fm);
        mfragment=new ArrayList<>();
        tabs=new ArrayList<>();
    }

    public void addFragment(Fragment fragment,String tab){
        mfragment.add(fragment);
        tabs.add(tab);

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mfragment.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
