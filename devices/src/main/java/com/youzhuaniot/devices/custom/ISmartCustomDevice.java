package com.youzhuaniot.devices.custom;

import com.youzhuaniot.callback.IResultCallBack;
import com.youzhuaniot.cmd.SensorCmd;
import com.youzhuaniot.cmd.VoiceCtrlCmd;
import com.youzhuaniot.cmd.YzCtrlCmd;

/**
 * 智能家居设备 操作实现
 */
public interface ISmartCustomDevice extends ISmartCustom {
//	void ctrlDevice();
	//获取全部设备
	void getAllDevice();

	//单设备控制
	void ctrlDevice(YzCtrlCmd yzCtrlCmd);

	//语音控制设备
	void voiceCtrlDevice(VoiceCtrlCmd voiceCtrlCmd);

	//获取传感器记录
	void getSensorRecord(SensorCmd sensorCmd);
}
