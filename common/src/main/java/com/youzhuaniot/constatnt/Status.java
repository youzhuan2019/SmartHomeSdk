package com.youzhuaniot.constatnt;

public enum  Status {

	NOT_LOGIN,  //未登录
	LOGIN_SUCCESS,  //登录成功
	LOGIN_ERROR,  //登录失败
	TOKEN_EXPIRED,  //Token失效

	INIT_SUCCESS,  //初始化成功
	INIT_FAIL,      //初始化失败

	CONNECTED,   //服务连接成功
	DISCONNECTED,  //服务断开连接
	CONNECT_ERROR  //服务连接失败
}
