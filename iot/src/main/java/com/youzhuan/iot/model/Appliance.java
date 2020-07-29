package com.youzhuan.iot.model;


import androidx.annotation.NonNull;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.youzhuan.iot.constant.YzDevAction;
import com.youzhuan.iot.constant.YzDevType;

import java.util.Arrays;

/**
 * <p>设备对象</p>
 */
public class Appliance implements Cloneable {
    //设备ID
    /**设备唯一ID*/
    private String applianceId;
    //设备具有的操作类型
    /**设备具有的操作类型*/
    private String[] actions;
    //设备的类型
    /**设备的类型*/
    private String[] applianceTypes;
    //设备名
    /**设备名*/
    private String deviceName;
    //厂商名
    /**厂商名*/
    private String manufacturerName;
    //如果具有自己的图标的话用该字段（可选,无值默认使用对应类型的本地图标）
    //图片URL链接
    /**如果具有自己的图标的话用该字段（可选,无值默认使用对应类型的本地图标）
     图片URL链接*/
    private String icon;
    //设备型号
    /**设备型号*/
    private String model;
    //设备型号名称
    /**设备型号名称*/
    private String modelName;
    //设备区域名称例如 （客厅,厨房）,如果此字段为空则可能赋予默认的值
    /**设备区域名称例如 （客厅,厨房）,如果此字段为空则可能赋予默认的值*/
    private String zone = "客厅";
    //设备楼层名称例如 （1楼,2楼）,如果此字段为空则可能赋予默认的值
    /**设备楼层名称例如 （1楼,2楼）,如果此字段为空则可能赋予默认的值*/
    private String floor = "1楼";
    //设备属性K - V
    /**设备属性K - V*/
    private JSONObject attributes;
    //补充字段
    /**补充字段*/
    private JSONObject additionalApplianceDetails;

    /**获取设备唯一ID*/
    public String getApplianceId() {
        return applianceId;
    }
    /**设置设备唯一ID  int*/
    public void setApplianceIdByInt(int applianceId) {
        this.applianceId = String.valueOf(applianceId);
    }
    /**设置设备唯一ID  string*/
    public void setApplianceId(String applianceId) {
        this.applianceId = applianceId;
    }
    /**获取设备支持的动作数组*/
    public String[] getActions() {
        return actions;
    }
    /**设置设备支持的动作数组*/
    public void setActions(String... actions) {
        this.actions = actions;
    }
    /**获取设备支持的设备类型*/
    public String[] getApplianceTypes() {
        return applianceTypes;
    }
    /**设置设备支持的设备类型*/
    public void setApplianceTypes(String... applianceTypes) {
        this.applianceTypes = applianceTypes;
    }
    /**获取设备名称*/
    public String getDeviceName() {
        return deviceName;
    }
    /**设置设备名称*/
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    /**获取厂商名称*/
    public String getManufacturerName() {
        return manufacturerName;
    }
    /**设置厂商名称*/
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    /**获取图片链接*/
    public String getIcon() {
        return icon;
    }
    /**设置图片链接*/
    public void setIcon(String icon) {
        this.icon = icon;
    }
    /**获取型号*/
    public String getModel() {
        return model;
    }
    /**设置型号*/
    public void setModel(String model) {
        this.model = model;
    }
    /**获取型号名称*/
    public String getModelName() {
        return modelName;
    }
    /**设置型号名称*/
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    /**获取区域*/
    public String getZone() {
        return zone;
    }
    /**设置区域*/
    public void setZone(String zone) {
        this.zone = zone;
    }
    /**获取楼层*/
    public String getFloor() {
        return floor;
    }
    /**设置楼层*/
    public void setFloor(String floor) {
        this.floor = floor;
    }
    /**获取设备属性值 JSONObject对象*/
    public JSONObject getAttributes() {
        return attributes;
    }
    /**设置设备属性值 JSONObject对象*/
    public void setAttributes(JSONObject attributes) {
        this.attributes = attributes;
    }
    /**获取补充字段 JSONObject对象*/
    public JSONObject getAdditionalApplianceDetails() {
        return additionalApplianceDetails;
    }
    /**设置补充字段 JSONObject对象*/
    public void setAdditionalApplianceDetails(JSONObject additionalApplianceDetails) {
        this.additionalApplianceDetails = additionalApplianceDetails;
    }


    @Override
    public Appliance clone(){
        try {
            return (Appliance) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
