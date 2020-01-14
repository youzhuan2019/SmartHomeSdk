package com.youzhuaniot.action;

/**
 *  需要登录实现的接口,平台支持登录则实现
 */
public interface ISmartLoginAction extends ISmartAction {
	void login();
	void logout();
	void getLoginState();
}
