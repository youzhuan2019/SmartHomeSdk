package com.youzhuan.iot;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.socks.library.KLog;
import com.youzhuan.iot.constant.SdkAction;
import com.youzhuan.iot.model.Appliance;
import com.youzhuan.iot.model.ControlRequest;
import com.youzhuan.iot.model.ControlResult;
import com.youzhuan.iot.model.SdkInfoConfig;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author 樱花满地集于我心
 * Create By 2020-07-02
 */
public abstract class YzIotService extends Service {

    private AidlIotCallback callback;

    @Override
    public void onCreate() {
        super.onCreate();
        KLog.init(true);
        KLog.e("创建IOT AIDL 服务");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        KLog.e("绑定IOT AIDL 服务");
        return new AidlIotService.Stub() {
            @Override
            public void register(AidlIotCallback callback) throws RemoteException {
                KLog.e("注册AidlIotCallback");
                YzIotService.this.callback = callback;
            }

            @Override
            public void executor(int action, String param) throws RemoteException {
                switch (action){
                    case SdkAction.SDK_INIT_IOT_SERVER:
                        init(getApplicationContext());

                        break;
                        case SdkAction.SDK_GET_DEVICES:
                            KLog.e("发现设备:"+param);
                            discoverAppliance(param);
                            break;
                    case SdkAction.SDK_CONTROL:
                        KLog.e("控制设备:"+param);
                        applianceControl(JSON.parseObject(param,ControlRequest.class));
                        break;
                    case SdkAction.SDK_GET_IOT_CONFIG:
                        SdkInfoConfig config = new SdkInfoConfig();
                        config = getSdkConfig();
                        notifyHost(SdkAction.SDK_GET_IOT_CONFIG,JSON.toJSONString(config));
                        break;
                    case SdkAction.SDK_LOGIN:
                        JSONObject jsonObj = JSON.parseObject(param);
                        login(jsonObj.getString("username"),jsonObj.getString("password"));
                        break;
                    case SdkAction.SDK_LOGOUT:
                        logout();
                        break;
                    default:
                        otherCommand(action, param);
                        break;
                }
            }
        };
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        KLog.e("IOT AIDL 服务销毁");
    }

    /**
     * 设备发现
     * @param param 补充参数JSON字符串
     */
    public abstract void discoverAppliance(String param);
    /**
     * 设备控制
     * @param controlRequest 请求的参数实体
     */
    public abstract void applianceControl(ControlRequest controlRequest);

    /**
     * 初始化服务
     * @param context Service上下文
     */
    public abstract void init(Context context);

    /**
     * 获取Sdk设置
     * @return 返回服务信息的配置
     */
    public abstract SdkInfoConfig getSdkConfig();

    /**
     * 登录
     * @param user 用户名
     * @param pwd  密码
     */
    public void login(String user,String pwd){
    }

    /**
     * 登出
     */
    public void logout(){

    }

    public void otherCommand(int action,String param){

    }


    /**
     * 主动通知主机回复消息
     * @param action 回复的结果标识类型 {@link com.youzhuan.iot.constant.SdkAction}
     * @param result 需要返回的结果 JSON 字符串
     */
    public void notifyHost(int action,String result){
        if(callback!=null){
            try {
                callback.onIotAidlCallBack(action,result);
            } catch (Exception e) {
                e.printStackTrace();
                KLog.e(e);
            }
        }else{
            KLog.e("callback 未注册");
        }
    }

}
