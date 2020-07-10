package com.youzhuan.iot.constant;

/**
 */
public interface SdkAction {
    /**
     * 初始化IOT服务
     */
    int SDK_INIT_IOT_SERVER = 4000;
    /**
     * 获取服务配置
     */
    int SDK_GET_IOT_CONFIG = 4001;
    /**
     * 登录
     */
    int SDK_LOGIN = 4002;
    /**
     * 登出
     */
    int SDK_LOGOUT = 4003;
    /**
     * 获取登录状态
     */
    int SDK_GET_LOGIN_STATE = 4004;
    /**
     * 获取设备
     */
    int SDK_GET_DEVICES = 4005;
    /**
     * 设备控制
     */
    int SDK_CONTROL = 4006;
    /**
     * 获取设备成功
     */
    int GET_DEVICE_SUCCESS = 2000;
    /**
     * 获取设备失败
     */
    int GET_DEVICE_FAIL = 2001;
    /**
     * 控制设备成功
     */
    int CONTROLLER_SUCCESS = 3001;
    /**
     * 控制设备失败
     */
    int CONTROLLER_FAIL = 3001;
    /**
     * 主动通知设备改变
     */
    int NOTIFY_APPLIANCE_CHANGE = 4007;
}
