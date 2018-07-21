package com.example.baidumap; /**
 * Created by zhangyue on 2017/7/12.
 */

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

public class BaiduMap extends Activity {
    MapView mMapView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("BaiduActivityTest", "进入了");
        SDKInitializer.initialize(getApplicationContext());
        Log.i("BaiduActivityTest", "初始化完成");
        setContentView(R.layout.activity_main);
        Log.i("BaiduActivityTest", "设置面板完成");
        mMapView = (MapView) findViewById(R.id.bmapView);
        Log.i("BaiduActivityTest", "初始化地图完成");
    }
}