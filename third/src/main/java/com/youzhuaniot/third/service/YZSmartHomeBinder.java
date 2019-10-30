package com.youzhuaniot.third.service;

import android.os.RemoteException;

import com.youzhuan.devices.custom.ISmartCustom;
import com.youzhuan.devices.custom.ISmartCustomDevice;
import com.youzhuan.devices.custom.ISmartCustomHost;
import com.youzhuan.devices.custom.ISmartCustomLogin;
import com.youzhuaniot.aidl.AidlCallBack;
import com.youzhuaniot.aidl.YzActionAidl;
import com.youzhuaniot.callback.IResultCallBack;
import com.youzhuaniot.common.constatnt.YzAction;
import com.youzhuaniot.common.utils.JsonUtil;
import com.youzhuaniot.entity.VoiceCtrlCmd;
import com.youzhuaniot.entity.YzCtrlCmd;


/**
 * 接收上层Aidl 服务指令的 实现类
 */
public class YZSmartHomeBinder extends YzActionAidl.Stub implements IResultCallBack {


	private ISmartCustom customAction;
	private AidlCallBack mAidlCallBack;
	public YZSmartHomeBinder(ISmartCustom customAction){
		this.customAction = customAction;
	}

	@Override
	public void doAction(int action,String paramJson) throws RemoteException {
		switch (action){
			case YzAction.ACTION_LOGIN:
				((ISmartCustomLogin) customAction).login();
				break;
			case YzAction.ACTION_GET_ALL_DEV:
				((ISmartCustomDevice) customAction).getAllDevice(this);
				break;
			case YzAction.ACTION_INIT:
				((ISmartCustomHost) customAction).init();
				break;
			case YzAction.ACTION_CTRL_DEV:
				((ISmartCustomDevice) customAction).
						ctrlDevice(JsonUtil.fromJson(paramJson, YzCtrlCmd.class),this);
				break;
			case YzAction.ACTION_CTRL_DEV_BY_VOICE:
				((ISmartCustomDevice) customAction).voiceCtrlDevice(
						JsonUtil.fromJson(paramJson, VoiceCtrlCmd.class),this);
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
