package com.wrg.balloontrip.fragment;

import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.google.gson.Gson;
import com.qf.kenlibrary.base.BaseFragment;
import com.qf.kenlibrary.util.DownUtil;
import com.wrg.balloontrip.R;
import com.wrg.balloontrip.adapter.TripAdapter;
import com.wrg.balloontrip.constants.Constants;
import com.wrg.balloontrip.entity.TripEntity;

import java.util.List;

/**
 * Created by Administrator on 2016/9/29 0029.
 * Author by RuiGan
 */

public class FragmentTrip extends BaseFragment implements DownUtil.OnDownListener {
    private TripAdapter tripAdapter;
    private ListView listView;

    @Override
    protected int getContentId() {
        return R.layout.fragmenttrip;
    }

    @Override
    protected void init(View view) {
            listView= (ListView) view.findViewById(R.id.fg_lv);

    }

    @Override
    protected void loadDatas() {
        new DownUtil().setOnDownListener(this).downJSON(Constants.URL_TRIP);
    }

    @Override
    public Object paresJson(String json) {
        if (json!=null){
            Log.d("print", "------------------>paresJson: "+json);
        return new Gson().fromJson(json.toString(), TripEntity.class);
        }
        return null;
    }

    @Override
    public void downSucc(Object object) {
            if (object!=null){
                TripEntity data= (TripEntity) object;
                List<TripEntity.DataBean> list = data.getData();
                tripAdapter=new TripAdapter(getActivity());
                tripAdapter.setDatas(list);
                listView.setAdapter(tripAdapter);
            }
    }
}
