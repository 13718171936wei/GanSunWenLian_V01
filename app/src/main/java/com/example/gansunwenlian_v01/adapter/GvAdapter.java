package com.example.gansunwenlian_v01.adapter;

import android.content.Context;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

/**
 * Created by 行走的力量 on 2016/11/3.
 */
public class GvAdapter extends SimpleAdapter {
    public GvAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);
    }
}
