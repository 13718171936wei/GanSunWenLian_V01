package com.example.gansunwenlian_v01.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.gansunwenlian_v01.Bean.Data;
import com.example.gansunwenlian_v01.R;
import com.example.gansunwenlian_v01.adapter.MyBaseAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 行走的力量 on 2016/11/3.
 */
public class Fragment01 extends Fragment {

    private GridView gv;
    private ListView lv;
    private ArrayList<HashMap<String, Object>> gvData;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f01, container, false);
        gv = (GridView) view.findViewById(R.id.gv);
        lv = (ListView) view.findViewById(R.id.lv);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        gvData = new Data().getGvData();
        SimpleAdapter gvAdapter = new SimpleAdapter(getActivity(), gvData, R.layout.gv_item, new String[]{"IMAGE", "TEXT"}, new int[]{R.id.iv_item, R.id.tv_item});
        gv.setAdapter(gvAdapter);
        ArrayList list=new ArrayList();
        for(int i=0;i<30;i++){
            list.add(i);
        }
        MyBaseAdapter myBaseAdapter=new MyBaseAdapter(getActivity(),list);
//        ArrayAdapter lvAdapter=new ArrayAdapter(getActivity(),R.layout.gv_item);
//        lv.setAdapter(lvAdapter);
        lv.setAdapter(myBaseAdapter);
    }
}
