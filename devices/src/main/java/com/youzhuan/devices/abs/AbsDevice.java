package com.youzhuan.devices.abs;

import android.text.TextUtils;

import com.youzhuaniot.callback.IResultCallBack;
import com.youzhuaniot.common.constatnt.YzAction;
import com.youzhuaniot.common.constatnt.YzAttribute;
import com.youzhuaniot.common.constatnt.YzOrder;
import com.youzhuaniot.common.utils.JsonUtil;
import com.youzhuaniot.entity.YzCtrlCmd;
import com.youzhuaniot.entity.YzSmartDevice;

import java.util.Map;
import java.util.regex.Pattern;

/**
 * 抽象类设备类
 * 抽象设备共性
 * SensorDev   SubDev 继承此类 如果指令需要特殊处理
 *
 */
public abstract class AbsDevice implements Device {

	//设备命令实体
	protected YzCtrlCmd cmd;
	//设备实体
	protected YzSmartDevice device;

	/**
	 * 转换方法根据匹配规则
	 * 可以转换为传感器设备(convertSensor)和子设备(convertSubDev)
	 * 没有则解析 命令(analyzeOrder)
	 */
	@Override
	public void convertToCustomCmd(YzCtrlCmd yzCtrlCmd, YzSmartDevice yzSmartDevice) {
		this.cmd = yzCtrlCmd;
		this.device = yzSmartDevice;
		if(Pattern.matches("sensor_.*",yzSmartDevice.getDevType())){
			convertSensor();
		}else if (!TextUtils.isEmpty(yzSmartDevice.getDevSubType())){
			convertSubDev();
		}
		analyzeOrder();
	}

	//设备打开命令执行方法
	public abstract void deviceOrderOn();
	//设备关闭命令执行方法
	public abstract void deviceOrderOff();
	//设备调节命令执行方法
	public abstract void deviceOrderAdjust(Map<String,String> yzAttributes);
	//设备设置命令执行方法
	public abstract void deviceOrderSet(Map<String,String> yzAttributes);
	//设备其他命令执行方法
	public abstract void deviceOrderOther();
	//转换为传感器设备空实现
	public void convertSensor(){}
	//转换为子设备空实现
	public  void convertSubDev(){}

	//解析命令
	private void analyzeOrder(){
		if(cmd!=null){
			switch (cmd.getOrder()){
				case YzOrder.ON:
					deviceOrderOn();
					device.addAttr(YzAttribute.ATTR_ON_OFF,String.valueOf(1));
					break;
				case YzOrder.OFF:
					deviceOrderOff();
					device.addAttr(YzAttribute.ATTR_ON_OFF,String.valueOf(0));
					break;
				case YzOrder.SET:
					deviceOrderSet(cmd.getAttr());
					break;
				case YzOrder.ADJUST:
					deviceOrderAdjust(cmd.getAttr());
					break;
				default:
					deviceOrderOther();
					break;
			}
		}
	}

	/**
	 * 通知上层主机更新信息UI
	 * @param action 动作指令
	 * @param resultCallBack
	 */
	@Override
	public void notifyHost(int action, IResultCallBack resultCallBack) {
		switch (action){
			case YzAction.ACTION_REPORT_DEVICE_STATUS:
				resultCallBack.onResult(YzAction.ACTION_REPORT_DEVICE_STATUS,
						JsonUtil.toJson(device));
				System.out.println("notifyHost:"+device.toString());
				break;
		}
	}
}
