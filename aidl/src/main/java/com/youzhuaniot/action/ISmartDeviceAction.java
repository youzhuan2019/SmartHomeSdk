package com.youzhuaniot.action;

import com.youzhuaniot.cmd.SensorCmd;
import com.youzhuaniot.cmd.VoiceCtrlCmd;
import com.youzhuaniot.cmd.YzCtrlCmd;

/**
 * 智能家居设备 操作实现
 */
public interface ISmartDeviceAction extends ISmartAction {
//	void ctrlDevice();
	//获取全部设备
	void getAllDevice();

	//单设备控制
	void ctrlDevice(String json);

	//语音控制设备
	void voiceCtrlDevice(String json);

	//获取传感器记录
	void getSensorRecord(String json);
}
