package com.youzhuaniot.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.youzhuaniot.callback.IResultCallBack;
import com.youzhuaniot.constatnt.YzAttribute;

import java.util.ArrayList;
import java.util.List;

/**
 * 智能家居控制Aidl 服务连接类
 */
@Deprecated
public class SmartControler implements ServiceConnection {

	private static final String TAG =  SmartControler.class.getName();
	private static final String _SERVER = "com.youzhuan.service.YZSmartHomeService";

	private YzActionAidl mYzAidl;
	@Override
	public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
		mYzAidl = YzActionAidl.Stub.asInterface(iBinder);
		try {
			mYzAidl.addCallBack(aidlCallBack);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onServiceDisconnected(ComponentName componentName) {
		mYzAidl = null;
	}

	public void doActionByAidl(int action,String paramJson){
		try {
			mYzAidl.doAction(action,paramJson);
		} catch (Exception exp){
			exp.printStackTrace();
		}
	}

	/**
	 * aidl 回调
	 */
	private AidlCallBack aidlCallBack = new AidlCallBack.Stub() {
		@Override
		public void onResult(int action,String info) throws RemoteException {
			for(IResultCallBack mCallBack : callBack){
				mCallBack.onResult(action,info);
			}
		}
	};

	/**
	 * 单例获取
	 */
	private static SmartControler instance;

	private SmartControler(){}

	public static SmartControler getInstance(){
		if(instance == null){
			synchronized (SmartControler.class){
				if(instance == null){
					instance = new SmartControler();
				}
			}
		}
		return instance;
	}

	/**
	 * 接口回调
	 */
	private List<IResultCallBack> callBack = new ArrayList<>();

	public void addResultCallBack(IResultCallBack callBack){
		this.callBack.add(callBack);
	}

	public void removeResultCallBack(IResultCallBack callBack){
		this.callBack.remove(callBack);
	}

	/**
	 * 绑定服务
	 * @param context
	 */
	public void bindSmartService(Context context){
		try {
			Intent intent = new Intent();
			intent.setAction(_SERVER);
			context.bindService(createExplicitFromImplicitIntent(context, intent),
					this,Context.BIND_AUTO_CREATE);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	private Intent createExplicitFromImplicitIntent(Context context, Intent implicitIntent) {
		PackageManager pm = context.getPackageManager();
		List<ResolveInfo> resolveInfo = pm.queryIntentServices(implicitIntent, 0);
		if (resolveInfo == null || resolveInfo.size() != 1) {
			return null;
		}
		ResolveInfo serviceInfo = resolveInfo.get(0);
		String packageName = serviceInfo.serviceInfo.packageName;
		String className = serviceInfo.serviceInfo.name;
		Log.d(TAG,"正在绑定Service  packageName"+packageName+"    className:"+className);
		ComponentName component = new ComponentName(packageName, className);
		Intent explicitIntent = new Intent(implicitIntent);
		explicitIntent.setComponent(component);
		return explicitIntent;
	}
}
