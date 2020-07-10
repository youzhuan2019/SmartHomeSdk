package com.youzhuan.iot.model.attr;

/**
 * @author 樱花满地集于我心
 * Create By 2020-07-03
 * 风速
 */
public class FanSpeed {

    public static final String LEVEL_LOW = "low";
    public static final String LEVEL_MIDDLE = "middle";
    public static final String LEVEL_HIGH = "high";

    private int value;
    private String level;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
