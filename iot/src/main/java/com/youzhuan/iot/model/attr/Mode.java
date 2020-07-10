package com.youzhuan.iot.model.attr;

/**
 * @author 樱花满地集于我心
 * Create By 2020-07-03
 * 模式数据
 */
public class Mode {

    public static final String COOL = "COOL";
    public static final String HEAT = "HEAT";
    public static final String DEHUMIDIFICATION = "DEHUMIDIFICATION";
    public static final String AUTO = "AUTO";


    private String deviceType;
    private String value;

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
