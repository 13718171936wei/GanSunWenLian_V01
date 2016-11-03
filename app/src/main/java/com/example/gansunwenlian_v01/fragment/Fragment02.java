package com.example.gansunwenlian_v01.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gansunwenlian_v01.R;

/**
 * Created by 行走的力量 on 2016/11/3.
 */
public class Fragment02 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.f02,container,false);
        return view;
    }
}
