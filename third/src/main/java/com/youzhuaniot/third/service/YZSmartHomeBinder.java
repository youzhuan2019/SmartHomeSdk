package com.youzhuaniot.third.service;

import android.os.RemoteException;

import com.youzhuaniot.cmd.SensorCmd;
import com.youzhuaniot.devices.custom.ISmartCustom;
import com.youzhuaniot.devices.custom.ISmartCustomDevice;
import com.youzhuaniot.devices.custom.ISmartCustomHost;
import com.youzhuaniot.devices.custom.ISmartCustomLogin;
import com.youzhuaniot.aidl.AidlCallBack;
import com.youzhuaniot.aidl.YzActionAidl;
import com.youzhuaniot.callback.IResultCallBack;
import com.youzhuaniot.constatnt.YzAction;
import com.youzhuaniot.common.utils.JsonUtil;
import com.youzhuaniot.cmd.VoiceCtrlCmd;
import com.youzhuaniot.cmd.YzCtrlCmd;
import com.youzhuaniot.devices.custom.ISmartCustomScene;


/**
 * 接收上层Aidl 服务指令的 实现类
 */
public class YZSmartHomeBinder extends YzActionAidl.Stub implements IResultCallBack{


	private ISmartCustom customAction;
	private AidlCallBack mAidlCallBack;

	public ISmartCustom getCustomAction() {
		return customAction;
	}

	public void setCustomAction(ISmartCustom customAction) {
		this.customAction = customAction;
	}

	@Override
	public void doAction(int action,String paramJson) throws RemoteException {
		switch (action){
			case YzAction.ACTION_LOGIN:
				((ISmartCustomLogin) customAction).login();
				break;
			case YzAction.ACTION_GET_LOGIN_STATE:
				((ISmartCustomLogin) customAction).getLoginState();
				break;
			case YzAction.ACTION_GET_ALL_DEV:
				((ISmartCustomDevice) customAction).getAllDevice();
				break;
			case YzAction.ACTION_INIT:
				((ISmartCustomHost) customAction).init();
				break;
			case YzAction.ACTION_CTRL_DEV:
				((ISmartCustomDevice) customAction).
						ctrlDevice(JsonUtil.fromJson(paramJson, YzCtrlCmd.class));
				break;
			case YzAction.ACTION_CTRL_DEV_BY_VOICE:
				((ISmartCustomDevice) customAction).voiceCtrlDevice(
						JsonUtil.fromJson(paramJson, VoiceCtrlCmd.class));
				break;
			case YzAction.ACTION_GET_SENSOR_RECORDS:
				((ISmartCustomDevice) customAction).getSensorRecord(
						JsonUtil.fromJson(paramJson, SensorCmd.class));
				break;
			case YzAction.ACTION_GET_SCENE_LIST:
				((ISmartCustomScene) customAction).getAllScene();
				break;
			case YzAction.ACTION_EXEC_SCENE_:
				((ISmartCustomScene) customAction).execScene(paramJson);
				break;
		}
	}

	@Override
	public void addCallBack(AidlCallBack callBack) throws RemoteException {
		mAidlCallBack = callBack;
	}


	@Override
	public void onResult(int action,String result) {
		try {
			mAidlCallBack.onResult(action,result);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}


}
