// AidlCallBack.aidl
package com.youzhuan.aidl;

// Declare any non-default types here with import statements
//上传到上层回调接口
interface AidlCallBack {
    /*
      action 动作值  参考 YzAction类
      info  返回的json 字符串
    */
    void onResult(int action,String info);
}
