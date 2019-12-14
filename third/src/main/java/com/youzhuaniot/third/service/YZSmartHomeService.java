package com.youzhuaniot.third.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.youzhuaniot.callback.IResultCallBack;
import com.youzhuaniot.constatnt.Status;
import com.youzhuaniot.devices.custom.ISmartCustom;


/**
 * 三方智能家居的抽象类
 */
public abstract class YZSmartHomeService extends Service {

	protected YZSmartHomeBinder homeBinder;

	@Override
	public void onCreate() {
		homeBinder = new YZSmartHomeBinder();
		homeBinder.setCustomAction(createSmartCustom());
		super.onCreate();
	}

	@Override
	public IBinder onBind(Intent intent) {
		return homeBinder;
	}

	public abstract ISmartCustom createSmartCustom();

	public  IResultCallBack getIResultCallBack(){
		return homeBinder;
	}
}
