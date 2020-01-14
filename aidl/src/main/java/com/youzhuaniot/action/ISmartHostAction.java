package com.youzhuaniot.action;


import com.youzhuaniot.entity.YzSmartHomeInfo;

/**
 *  智能家居设备 的一些设置实现
 */
public interface ISmartHostAction extends ISmartAction {
	//获取智能家居主机信息
	YzSmartHomeInfo getSmartHomeInfo();
	//查询主机设备
	void findHost();
	//取绑主机
	void unBindForHost();
	//初始化
	void init();
}
