package com.example.gansunwenlian_v01.Bean;

import com.example.gansunwenlian_v01.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 行走的力量 on 2016/11/3.
 */
public class Data {
    public int Image;//图片
    public String title;//标题
    public ArrayList<HashMap<String, Object>> gvData;
    public HashMap<String, Object> map;
    public int[] image = {R.mipmap.gv1, R.mipmap.gv2, R.mipmap.gv3,
            R.mipmap.gv4, R.mipmap.gv5, R.mipmap.gv6, R.mipmap.gv7,
            R.mipmap.gv8, R.mipmap.gv9, R.mipmap.gv10, R.mipmap.gv11, R.mipmap.gv12, R.mipmap.gv13, R.mipmap.gv14, R.mipmap.gv7, R.mipmap.gv8};
    public String[] texts = {"作家协会", "美术家协会", "杂技家协会", "戏剧家协会", "舞蹈家协会", "音乐家协会", "曲艺家协会", "民间文学家协会", "书法家协会", "电影家协会", "摄影家协会", "电视艺术家协会", "评论家协会", "飞天编辑部", "文学院", "理学研究会"};

    /**
     * GridView数据
     *
     * @return
     */
    public ArrayList<HashMap<String, Object>> getGvData() {
        gvData = new ArrayList<HashMap<String, Object>>();
        map = new HashMap<String, Object>();
        map.put("IMAGE", image);
        map.put("TEXT", texts);
        gvData.add(map);
        return gvData;
    }
}
