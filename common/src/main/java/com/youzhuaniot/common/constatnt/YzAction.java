package com.youzhuaniot.common.constatnt;

/**
 * 动作指令集合
 */
public interface YzAction {
	//初始化
	int ACTION_INIT = 100;
	//登录
	int ACTION_LOGIN = 101;
	//登录状态
	int ACTION_LOGIN_STATE = 102;
	//家庭选择
	int ACTION_FAMILY_SELECT = 103;
	//查询和绑定设备
	int ACTION_FIND_AND_BIND_SMART_DEV = 104;
	//登出
	int ACTION_LOGOUT = 105;
	//获取全部的设备
	int ACTION_GET_ALL_DEV = 106;
	//控制设备
	int ACTION_CTRL_DEV = 107;
	//语音控制设备
	int ACTION_CTRL_DEV_BY_VOICE = 108;
	//上报设备状态
	int ACTION_REPORT_DEVICE_STATUS = 109;
}
