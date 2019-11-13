package com.youzhuaniot.common;

import com.youzhuaniot.common.utils.JsonUtil;
import com.youzhuaniot.constatnt.YzLoginType;
import com.youzhuaniot.entity.YzSmartHomeInfo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
	@Test
	public void addition_isCorrect() {
		YzSmartHomeInfo info = new YzSmartHomeInfo();
		info.setLoginType(YzLoginType.ACCOUNT);
		String json = JsonUtil.toJson(info);
		System.out.println(json);
		YzSmartHomeInfo convert = JsonUtil.fromJson(json,YzSmartHomeInfo.class);
		System.out.println(convert.toString());
	}
}