package com.youzhuaniot.constatnt;

/**
 * 动作指令集合
 */
public interface YzAction {
	//初始化
	int ACTION_INIT = 10;
	//登录
	int ACTION_LOGIN = 11;
	//获取登录状态
	int ACTION_GET_LOGIN_STATE = 12;
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

	//获取传感器记录
	int ACTION_GET_SENSOR_RECORDS = 110;

	//上报设备状态
	int ACTION_REPORT_DEVICE_STATUS = 100001;
	//上报传感器设备记录
	int REPORT_SENSOR_RECORDS= 100002;
	//获取场景列表Action
	int ACTION_GET_SCENE_LIST = 20000;
	//执行场景列表
	int ACTION_EXEC_SCENE_ = 20001;
}
