package com.wrg.balloontrip.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.qf.kenlibrary.base.BaseFragment;
import com.wrg.balloontrip.R;
import com.wrg.balloontrip.entity.TopPhotoViewEntity;

import butterknife.BindView;

/**
 * Created by Administrator on 2016/9/30 0030.
 * Author by RuiGan
 */

public class FragmentTopPhoto extends BaseFragment {
    @BindView(R.id.fgtopphoto_cover)
    ImageView photo;


    @Override
    protected int getContentId() {
        return R.layout.fragmenttopphoto;
    }


    @Override
    protected void init(View view) {

    }

    public static FragmentTopPhoto getInstance(TopPhotoViewEntity.DataBean dataBean){
        FragmentTopPhoto fragmentTopPhoto=new FragmentTopPhoto();
        Bundle bundle=new Bundle();
        bundle.putSerializable("url",dataBean.getPhoto().getPhoto_url());
        fragmentTopPhoto.setArguments(bundle);
        return fragmentTopPhoto;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle=getArguments();
        String urlphoto= (String) bundle.getSerializable("url");
        Glide.with(getActivity())
                .load(urlphoto)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(photo);
    }
}
