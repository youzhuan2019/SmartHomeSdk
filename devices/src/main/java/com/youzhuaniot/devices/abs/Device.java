package com.youzhuaniot.devices.abs;


import com.youzhuaniot.callback.IResultCallBack;
import com.youzhuaniot.entity.YzCtrlCmd;
import com.youzhuaniot.entity.YzSmartDevice;

/**
 * 在AbsDevice 无法满足需求时 通过实现此接口来定义设备
 */
public interface Device {
	//转换方法
	void convertToCustomCmd(YzCtrlCmd yzCtrlCmd, YzSmartDevice yzSmartDevice);
	//通知主机
	void notifyHost(int action, IResultCallBack resultCallBack);
	//能否执行
	boolean canExec(YzSmartDevice yzSmartDevice);
}
