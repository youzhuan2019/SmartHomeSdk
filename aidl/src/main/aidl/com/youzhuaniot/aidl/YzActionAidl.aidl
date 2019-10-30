// YzActionAidl.aidl
package com.youzhuaniot.aidl;

// Declare any non-default types here with import statements

import com.youzhuaniot.aidl.AidlCallBack;
interface YzActionAidl {
     //执行动作给下层服务
     //action 动作指令 参考YzAction
     //paramJson Json字符串
     void doAction(int action,String paramJson);

     //添加回调接口
     void addCallBack(AidlCallBack callBack);
}
