package com.youzhuan.iot.model.attr;

/**
 * @author 樱花满地集于我心
 * Create By 2020-07-03
 * 温度数据
 */
public class Temperature {

    public static final String FAHRENHEIT = "FAHRENHEIT";
    public static final String CELSIUS = "CELSIUS";

    private int value;
    private String scale;

    public Temperature() {
        this.scale = CELSIUS;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }
}
