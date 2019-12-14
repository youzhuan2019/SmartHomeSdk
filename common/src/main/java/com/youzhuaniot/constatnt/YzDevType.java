package com.youzhuaniot.constatnt;



public interface YzDevType {
	//未知
	String DEV_TYPE_UNKNOWN = "unknown";
	//普通灯
	String LIGHT = "LIGHT";
	//开关
	String SWITCH = "SWITCH";
	//插座
	String SOCKET = "SOCKET";
	//窗帘
	String CURTAIN = "CURTAIN";
	//窗纱类设备
	String CURT_SIMP = "CURT_SIMP";
	//空调
	String AIR_CONDITION = "AIR_CONDITION";
	//电视机
	String TV_SET = "TV_SET";
	//机顶盒
	String SET_TOP_BOX = "SET_TOP_BOX";
	//空气监测器类设备
	String AIR_MONITOR = "AIR_MONITOR";
	//空气净化器
	String AIR_PURIFIER = "AIR_PURIFIER";
	//净水器
	String WATER_PURIFIER = "WATER_PURIFIER";
	//加湿器
	String HUMIDIFIER = "HUMIDIFIER";
	//电风扇
	String FAN = "FAN";
	//热水器类设备
	String WATER_HEATER = "WATER_HEATER";
	//电暖器类设备
	String HEATER = "HEATER";
	//洗衣机类设备
	String WASHING_MACHINE = "WASHING_MACHINE";
	//晾衣架
	String CLOTHES_RACK = "CLOTHES_RACK";
	//燃气灶类设备
	String GAS_STOVE = "GAS_STOVE";
	//油烟机类设备
	String RANGE_HOOD = "RANGE_HOOD";
	//烤箱设备
	String OVEN = "OVEN";
	//微波炉
	String MICROWAVE_OVEN = "MICROWAVE_OVEN";
	//压力锅
	String PRESSURE_COOKER = "PRESSURE_COOKER";
	//电饭煲
	String RICE_COOKER = "RICE_COOKER";
	//电磁炉
	String INDUCTION_COOKER = "INDUCTION_COOKER";
	//破壁机
	String HIGH_SPEED_BLENDER = "HIGH_SPEED_BLENDER";

	//扫地机器人
	String SWEEPING_ROBOT = "SWEEPING_ROBOT";
	//FRIDGE冰箱
	String FRIDGE = "FRIDGE";
	//PRINTER: 打印机
	String PRINTER = "PRINTER";
	//AIR_FRESHER：新风机
	String AIR_FRESHER = "AIR_FRESHER";
	//KETTLE：热水壶
	String KETTLE = "KETTLE";
	//WEBCAM：摄像头
	String WEBCAM = "WEBCAM";
	//ROBOT：机器人
	String ROBOT = "ROBOT";
	//WINDOW_OPENER：开窗器
	String WINDOW_OPENER = "WINDOW_OPENER";
	//DISINFECTION_CABINET：消毒柜
	String DISINFECTION_CABINET = "DISINFECTION_CABINET";
	//洗碗机
	String DISHWASHER = "DISHWASHER";
	//SCENE_TRIGGER：描述特定设备的组合场景，设备之间没有相互关联，无特定操作顺序。
	// 例如“打开睡眠模式”包括关灯和锁上房门，但是关灯和锁上房门之间没有必然联系，
	// 可以先关灯然后锁上房门，也可以先锁上房门后关灯
	String SCENE_TRIGGER = "SCENE_TRIGGER";
	//描述特定设备的组合场景。场景中的设备必须以指定顺序操作。如“观看优酷视频”场景中必须先打开电视机，然后打开HDMI1。
	String ACTIVITY_TRIGGER = "ACTIVITY_TRIGGER";
	//SOFA: 沙发品类
	String SOFA = "SOFA";
	//BED：床
	String BED = "BED";
	//SHOE_CABINET：鞋柜
	String SHOE_CABINET = "SHOE_CABINET";
//
//	public interface Sub{
//		String SUB_COLOR_RGB_LIGHT = "rgb_light";
//		String SUB_COLOR_WARM_LIGHT = "color_warm_light";
//		String SUB_CURTAIN_POSITION = "curtain_position";
//	}
//
//	interface Sensor{
//		String DEV_TYPE_TEMPERATURE_SENSOR = "sensor_temperature";
//		String DEV_TYPE_HUMIDITY_SENSOR = "sensor_humidity";
//		String DEV_TYPE_SOS_SENSOR = "sensor_sos";
//		String DEV_TYPE_GAS_SENSOR = "sensor_gas";
//		String DEV_TYPE_IR_SENSOR = "sensor_ir";
//		String DEV_TYPE_DOOR_MAGNET = "sensor_door_magnet";
//		String DEV_TYPE_FlOOD_SENSOR = "sensor_flood";
//		String DEV_TYPE_PM25_SENSOR = "sensor_pm25";
//		String DEV_TYPE_CO_SENSOR = "sensor_co";
//		String DEV_TYPE_CO2_SENSOR = "sensor_co2";
//		String DEV_TYPE_SMOKE_SENSOR = "sensor_smoke";
//	}
}
