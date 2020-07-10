package com.youzhuan.iot.model;


import com.alibaba.fastjson.JSONObject;
import com.youzhuan.iot.constant.YzRequestCode;

/**
 * <p>控制请求的参数对象</p>
 */
public class ControlRequest {
    /**设备对象*/
    private Appliance appliance;
    /**请求类型*/
    @YzRequestCode
    private String type;
    /**请求携带的属性值*/
    private JSONObject values;

    public Appliance getAppliance() {
        return appliance;
    }

    public void setAppliance(Appliance appliance) {
        this.appliance = appliance;
    }


    @YzRequestCode
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public JSONObject getValues() {
        return values;
    }

    public void setValues(JSONObject values) {
        this.values = values;
    }
}
