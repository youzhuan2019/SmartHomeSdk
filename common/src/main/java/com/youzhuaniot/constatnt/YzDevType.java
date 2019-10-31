package com.youzhuaniot.constatnt;



public interface YzDevType {
	//未知
	String DEV_TYPE_UNKNOWN = "unknown";
	//普通灯
	String DEV_TYPE_LIGHT = "light";
	//开关
	String DEV_TYPE_SWITCH = "switch";
	//无精度窗帘
	String DEV_TYPE_CURTAIN = "curtain";
	//插座
	String DEV_TYPE_OUTLET = "outlet";
	//音箱
	String DEV_TYPE_SPEAKER = "speaker";
	//空气净化器
	String DEV_TYPE_AIR_PURIFIER = "air_purifier";
	//调光灯
	String DEV_TYPE_DIMMER_LIGHT = "dimmer_light";

	public interface Sub{
		String SUB_COLOR_RGB_LIGHT = "rgb_light";
		String SUB_COLOR_WARM_LIGHT = "color_warm_light";
		String SUB_CURTAIN_POSITION = "curtain_position";
	}

	interface Sensor{
		String DEV_TYPE_TEMPERATURE_SENSOR = "sensor_temperature";
		String DEV_TYPE_HUMIDITY_SENSOR = "sensor_humidity";
	}
}
