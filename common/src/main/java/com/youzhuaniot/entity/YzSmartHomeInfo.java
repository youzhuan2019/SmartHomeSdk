package com.youzhuaniot.entity;

import com.youzhuaniot.constatnt.YzLoginType;

/**
 * 智能设备参数信息实体
 */
public class YzSmartHomeInfo {
	//是否支持登录
	private boolean isSupportLogin;
	//是否支持导入家庭
	private boolean isSupportFamily;
	//登录方式
	private YzLoginType loginType;

	public boolean isSupportLogin() {
		return isSupportLogin;
	}

	public void setSupportLogin(boolean supportLogin) {
		isSupportLogin = supportLogin;
	}

	public boolean isSupportFamily() {
		return isSupportFamily;
	}

	public void setSupportFamily(boolean supportFamily) {
		isSupportFamily = supportFamily;
	}

	public YzLoginType getLoginType() {
		return loginType;
	}

	public void setLoginType(YzLoginType loginType) {
		this.loginType = loginType;
	}

	@Override
	public String toString() {
		return "YzSmartHomeInfo{" +
				"isSupportLogin=" + isSupportLogin +
				", isSupportFamily=" + isSupportFamily +
				", loginType=" + loginType +
				'}';
	}
}
