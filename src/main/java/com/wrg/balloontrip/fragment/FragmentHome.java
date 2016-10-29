package com.wrg.balloontrip.fragment;

import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.google.gson.Gson;
import com.qf.kenlibrary.base.BaseFragment;
import com.qf.kenlibrary.util.DownUtil;
import com.wrg.balloontrip.R;
import com.wrg.balloontrip.adapter.ParentListviewAdapter;
import com.wrg.balloontrip.adapter.TopPhotoViewpagerAdapter;
import com.wrg.balloontrip.constants.Constants;
import com.wrg.balloontrip.entity.StrategyEntity;
import com.wrg.balloontrip.entity.TopPhotoViewEntity;

import java.util.List;

/**
 * Created by Administrator on 2016/9/29 0029.
 * Author by RuiGan
 */

public class FragmentHome extends BaseFragment implements DownUtil.OnDownListener {




    private ParentListviewAdapter parentListviewAdapter;//父的
    //private ChildGridViewAdapter gridadapter;//子的

    private ListView listView;
    //private GridView gridView;

    private TopPhotoViewpagerAdapter topPhotoViewpagerAdapter;
    private ViewPager viewPager;


    @Override
    protected int getContentId() {
        return R.layout.fragmenthome;
    }

    @Override
    protected void init(View view) {

        //gridView = (GridView) view.findViewById(R.id.fghome_gvchild);
        viewPager = (ViewPager) view.findViewById(R.id.fg_vp);
        listView= (ListView) view.findViewById(R.id.parent_lv);

    }

    @Override
    protected void loadDatas() {
        new DownUtil().setOnDownListener(this).downJSON(Constants.URL_STRATEGY_LIST);
        new DownUtil().setOnDownListener(new DownUtil.OnDownListener() {
            @Override
            public Object paresJson(String json) {
                if (json != null) {
                    return new Gson().fromJson(json.toString(), TopPhotoViewEntity.class);
                }
                return null;
            }

            @Override
            public void downSucc(Object object) {
                if (object != null) {
                    TopPhotoViewEntity photo = (TopPhotoViewEntity) object;
                    List<TopPhotoViewEntity.DataBean> data = photo.getData();

                    //Glide.with(getActivity()).load(photo.getData().get(0).getPhoto().getPhoto_url()).diskCacheStrategy(DiskCacheStrategy.ALL).into(fghome_gb);
                    topPhotoViewpagerAdapter = new TopPhotoViewpagerAdapter(getChildFragmentManager(), data);
                    viewPager.setAdapter(topPhotoViewpagerAdapter);

                }

            }
        }).downJSON(Constants.URL_COVER);
    }


    @Override
    public Object paresJson(String json) {

        if (json != null) {
            Log.d("print", "paresJson: " + json);
            return new Gson().fromJson(json.toString(), StrategyEntity.class);
        }
        return null;
    }

    @Override
    public void downSucc(Object object) {
        if (object != null) {
            StrategyEntity data = (StrategyEntity) object;




            //父类的listview
            List<StrategyEntity.DataBean> list1 = data.getData();
            parentListviewAdapter=new ParentListviewAdapter(getActivity());
            parentListviewAdapter.setDatas(list1);
            listView.setAdapter(parentListviewAdapter);

        }
    }


}
