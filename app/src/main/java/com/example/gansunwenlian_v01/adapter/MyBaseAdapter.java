package com.example.gansunwenlian_v01.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gansunwenlian_v01.R;

import java.util.ArrayList;

/**
 * Created by 行走的力量 on 2016/11/3.
 */
public class MyBaseAdapter extends BaseAdapter {

    private Context context;
    private ArrayList list;

    public MyBaseAdapter(android.content.Context context, ArrayList list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=View.inflate(context, R.layout.lv_item,null);
        ImageView iv = (ImageView) view.findViewById(R.id.imageView);
        TextView tv = (TextView) view.findViewById(R.id.textView);
        iv.setImageResource(R.mipmap.ic_launcher);
        tv.setText((Integer) list.get(i)+"");
        return view;
    }
}
