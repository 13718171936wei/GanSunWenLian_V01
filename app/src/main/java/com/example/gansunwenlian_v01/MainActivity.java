package com.example.gansunwenlian_v01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;

import com.example.gansunwenlian_v01.fragment.Fragment01;
import com.example.gansunwenlian_v01.fragment.Fragment02;
import com.example.gansunwenlian_v01.fragment.Fragment03;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private ImageButton imgBtn01;
    private ImageButton imgBtn02;
    private ImageButton imgBtn03;
    private ImageButton imgBtn04;
    private ImageButton imgBtn05;
    private ImageButton imgBtn06;
    private ViewPager vp;
    private ArrayList<Fragment> fList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //注意先准备数据，否则出现空指针错误
        initFragment();
        initView();
    }

    /**
     * 初始化Fragment
     */
    private void initFragment() {
        fList = new ArrayList<Fragment>();
        Fragment f01 = new Fragment01();
        Fragment f02 = new Fragment02();
        Fragment f03 = new Fragment03();
        fList.add(f01);
        fList.add(f02);
        fList.add(f03);
    }

    /**
     * 组件初始化
     */
    private void initView() {
        imgBtn01 = (ImageButton) findViewById(R.id.imageButton01);
        imgBtn02 = (ImageButton) findViewById(R.id.imageButton02);
        imgBtn03 = (ImageButton) findViewById(R.id.imageButton03);
        imgBtn04 = (ImageButton) findViewById(R.id.imageButton04);
        imgBtn05 = (ImageButton) findViewById(R.id.imageButton05);
        imgBtn06 = (ImageButton) findViewById(R.id.imageButton06);
        imgBtnListener();
        vp = (ViewPager) findViewById(R.id.vp);
        vpAdapter();
        vpListener();
    }

    /**
     * ViewPager监听事件
     */
    private void vpListener() {
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /**
             * @param position   :当前页面，及你点击滑动的页面
             * @param positionOffset   :当前页面偏移的百分比
             * @param positionOffsetPixels  :当前页面偏移的像素位置
             */
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position != 1)
                    positionOffset = 0;
            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    /**
     * ViewPager适配器
     */
    private void vpAdapter() {
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fList.get(position);
            }

            @Override
            public int getCount() {
                return fList.size();
            }
        });
    }

    /**
     * 设置ImageButton监听事件
     */
    private void imgBtnListener() {
        imgBtn01.setOnClickListener(this);
        imgBtn02.setOnClickListener(this);
        imgBtn03.setOnClickListener(this);
        imgBtn04.setOnClickListener(this);
        imgBtn05.setOnClickListener(this);
        imgBtn06.setOnClickListener(this);
    }

    /**
     * 处理ImageButton监听操作
     *
     * @param view
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButton01:

                break;
            case R.id.imageButton02:
                break;
            case R.id.imageButton03:
                break;
            case R.id.imageButton04:
                vp.setCurrentItem(0,false);
                break;
            case R.id.imageButton05:
                vp.setCurrentItem(1,false);
                break;
            case R.id.imageButton06:
                vp.setCurrentItem(2,false);
                break;
        }
    }
}
