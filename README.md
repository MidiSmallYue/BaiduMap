参考 http://www.manew.com/thread-97186-1-1.html 原版实现使用的 Eclipse，本文将使用Android sutio，操作略有不同

按照原版 会有一些问题，导入百度地图所需的库后，需要自己新建一个module，毕竟是要给unity用的。自己添加一个layout以及res里所需的东西，将layout里的布局文件更改一下，加上百度地图的布局

```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.baidumap.MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!" />
    <com.baidu.mapapi.map.MapView
        android:id="@+id/bmapView"
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:clickable="true" />
</RelativeLayout>
```

AndroidManifest.xml  里的key 换成你自己在百度后台的key。。。。。

然后生成一个aar包，直接导入unity 中 Plugins/Android中就行呢，Unity 这边代码没啥变化。打包测试发现wifi时地图出来就是网格形式的，换数据就能正常显示，不知道我这边wifi是不是有什么限制。

本来打成一个jar 包也行的，但是我试了一下没成功，在百度论坛查了查说，生成jar包时资源没打过去，也是有点奇怪，我把aar包解开看，有百度地图的一个资源之类的，而jar包就没有