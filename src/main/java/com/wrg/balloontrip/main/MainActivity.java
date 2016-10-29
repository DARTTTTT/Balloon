package com.wrg.balloontrip.main;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.qf.kenlibrary.base.BaseActivity;
import com.wrg.balloontrip.R;
import com.wrg.balloontrip.adapter.MainViewPagerAdapter;
import com.wrg.balloontrip.fragment.FragmentHome;
import com.wrg.balloontrip.fragment.FragmentMine;
import com.wrg.balloontrip.fragment.FragmentPlan;
import com.wrg.balloontrip.fragment.FragmentTrip;

public class MainActivity extends BaseActivity implements TabLayout.OnTabSelectedListener {
    private ViewPager viewpager;
    private TabLayout tabLayout;
    private int[] cover = {R.mipmap.icon_tab_home, R.mipmap.icon_tab_trip, R.mipmap.icon_tab_plan, R.mipmap.icon_tab_my};
    private String[] tabs = {"攻略", "游记", "行程单", "我的"};

    @Override
    protected int getContentId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        viewpager = (ViewPager) findViewById(R.id.vp);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        initViewpager(viewpager);
        tabLayout.setupWithViewPager(viewpager);//此处的方法是为了页面和标题联动
        tabLayout.addOnTabSelectedListener(this);//
    }

    /**
     * 初始化一个viewpagerd的方法
     *
     * @param viewPager
     */
    private void initViewpager(ViewPager viewPager) {

        MainViewPagerAdapter adapter = new MainViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentHome(), tabs[0]);
        adapter.addFragment(new FragmentTrip(), tabs[1]);
        adapter.addFragment(new FragmentPlan(), tabs[2]);
        adapter.addFragment(new FragmentMine(), tabs[3]);
        viewPager.setAdapter(adapter);

    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        tab.setText("");
        tab.setIcon(cover[tab.getPosition()]);


    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

        tab.setIcon(null);
        tab.setText(tabs[tab.getPosition()]);
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }


    /***
     * 沉浸式状态栏
     *
     * @return
     */
    @Override
    public boolean isOpenStatus() {
        return false;
    }
}
