package com.wrg.balloontrip.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.wrg.balloontrip.R;
import com.wrg.balloontrip.entity.StrategyEntity;
import com.wrg.balloontrip.main.StrategyDetailActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/1 0001.
 * Author by RuiGan
 */

public class ParentListviewAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {
    private Context context;
    private List<StrategyEntity.DataBean> datas;


    public ParentListviewAdapter(Context context){
        this.context=context;
        datas=new ArrayList<>();
    }

    public void setDatas(List<StrategyEntity.DataBean> datas){
        this.datas=datas;
        this.notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView!=null){
            viewHolder= (ViewHolder) convertView.getTag();

        }else {
            viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.item_parent_listview_layout,null);
            viewHolder.gridView= (GridView) convertView.findViewById(R.id.item_lsitview_gridview);

            viewHolder.stitle= (TextView) convertView.findViewById(R.id.item_lsitview_stitle);
            viewHolder.btitle= (TextView) convertView.findViewById(R.id.item_lsitview_btitle);
            convertView.setTag(viewHolder);

        }
        /**
         * 监听设置在获得值处
         */
        viewHolder.gridView.setOnItemClickListener(this);
        viewHolder.stitle.setText(datas.get(position).getName());
        viewHolder.btitle.setText(datas.get(position).getButton_text());
        //这里是在相应的listview中的item添加相应的数据
        viewHolder.gridView.setAdapter(new ChildGridViewAdapter(context).setDatas(datas.get(position).getDestinations()));


        return convertView;
    }


    class  ViewHolder {
        GridView gridView;
        TextView btitle,stitle;

    }
    /**
     * 每一个gridview的监听事件
     * @param parent
     * @param view
     * @param position
     * @param id
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        /**
         * 提示点2
         */

        StrategyEntity.DataBean.DestinationsBean item = (StrategyEntity.DataBean.DestinationsBean) parent.getAdapter().getItem(position);
        int id1 = item.getId();
        Log.d("print", "每一个gridview获得的onItemClick: "+id1);
        Intent intent=new Intent(context, StrategyDetailActivity.class);
        intent.putExtra("id",id1);
        context.startActivity(intent);
    }


}
