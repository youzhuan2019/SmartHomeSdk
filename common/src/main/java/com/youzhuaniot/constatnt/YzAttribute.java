package com.youzhuaniot.constatnt;

public interface YzAttribute {

	//开关属性
	String ATTR_ON_OFF= "attr_on_off";
	//有精度的窗帘属性位置
	String ATTR_CURTAIN_POS = "attr_curtain_pos";
	//饱和度
	String ATTR_SATURATION = "attr_saturation";
	//亮度
	String ATTR_BRIGHTNESS = "attr_brightness";
	//色彩
	String ATTR_RGB_COLOR = "attr_rgb_color";
	//模式选择
	String ATTR_MODE = "attr_mode";
	//风速
	String ATTR_WIND_SPEED = "attr_wind_speed";
	//风向
	String ATTR_WIND_DIRECTION = "attr_wind_direction";
	//温度
	String ATTR_TEMPERATURE = "attr_temperature";

	//v2 加入
	String turnOnState = "turnOnState";
	String brightness = "brightness";
	String color = "color";
	String temperature = "temperature";
	String mode = "mode";
	String fanSpeed = "fanSpeed";
	String fanDirection = "fanDirection";
}
