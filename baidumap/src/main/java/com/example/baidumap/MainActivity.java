package com.example.baidumap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MainActivity {

    private static Context unityContext;
    private static Activity unityActivity;

    //init方法，用来传入上下文
    public static void init(Context paramContext){
        unityContext = paramContext.getApplicationContext();
        unityActivity = (Activity) paramContext;
    }
    public static void StartActivity0()    {
        // TODO Auto-generated method stub

        unityActivity.runOnUiThread(new Runnable()
        {
            public void run()
            {
                try{
                    Log.i("startA", "startActivity0");
                    Intent intent = new Intent(unityActivity, BaiduMap.class);
                    unityActivity.startActivity(intent);
                }
                catch (Exception e) {
                    e.printStackTrace();

                }
            }
        });
    }
}