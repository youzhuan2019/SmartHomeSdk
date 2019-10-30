package com.youzhuan.devices.custom;

/**
 *  需要登录实现的接口,平台支持登录则实现
 */
public interface ISmartCustomLogin extends ISmartCustom {
	void login();
	void logout();
	void getLoginState();
}
