package com.youzhuaniot.third.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.youzhuan.devices.custom.ISmartCustom;


/**
 * 三方智能家居的抽象类
 */
public abstract class YZSmartHomeService extends Service {

	protected YZSmartHomeBinder homeBinder;

	@Override
	public void onCreate() {
		homeBinder = new YZSmartHomeBinder(createSmartCustom());
		super.onCreate();
	}

	@Override
	public IBinder onBind(Intent intent) {
		return homeBinder;
	}

	public abstract ISmartCustom createSmartCustom();
}
