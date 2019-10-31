package com.youzhuaniot.devices.custom;

import com.youzhuaniot.callback.IResultCallBack;
import com.youzhuaniot.entity.VoiceCtrlCmd;
import com.youzhuaniot.entity.YzCtrlCmd;

/**
 * 智能家居设备 操作实现
 */
public interface ISmartCustomDevice extends ISmartCustom {
//	void ctrlDevice();
	//获取全部设备
	void getAllDevice(IResultCallBack callBack);

	//单设备控制
	void ctrlDevice(YzCtrlCmd yzCtrlCmd, IResultCallBack callBack);

	//语音控制设备
	void voiceCtrlDevice(VoiceCtrlCmd voiceCtrlCmd, IResultCallBack callBack);
}
