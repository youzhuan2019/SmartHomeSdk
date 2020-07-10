package com.youzhuan.iot.model.attr;

/**
 * @author 樱花满地集于我心
 * Create By 2020-07-03
 * 风向
 */
public class Direction {

    public static final String UP_DOWN_SWING = "UP_DOWN_SWING";
    public static final String STOP_SWING = "STOP_SWING";
    public static final String LEFT_RIGHT_SWING = "LEFT_RIGHT_SWING";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;
}
