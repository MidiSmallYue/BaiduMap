using UnityEngine;
using UnityEngine.UI;
using System.Collections;

public class Test : MonoBehaviour
{
    // Update is called once per frame
    
    public Button btnStartLBSMap;

    AndroidJavaClass unityPlayer;
    AndroidJavaObject currentActivity;
    AndroidJavaClass androidCall;
    void Start()
    {
        //获取context
        unityPlayer = new AndroidJavaClass("com.unity3d.player.UnityPlayer");
        currentActivity = unityPlayer.GetStatic<AndroidJavaObject>("currentActivity");

        androidCall = new AndroidJavaClass("com.example.baidumap.MainActivity");
        androidCall.CallStatic("init", currentActivity);


     
        btnStartLBSMap.onClick.AddListener(BtnStartLBSMapOnClick);

    }
    void Update()
    {
        //当用户按下手机的返回键或home键退出游戏
        if (Input.GetKeyDown(KeyCode.Escape) || Input.GetKeyDown(KeyCode.Home))
        {
            Application.Quit();
        }
    }

    void BtnStartLBSMapOnClick()
    {
        androidCall.CallStatic("StartActivity0");

        Debug.Log("2");
    }
}