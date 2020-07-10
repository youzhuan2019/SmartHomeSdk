package com.youzhuan.iot.model;


import com.youzhuan.iot.constant.YzResponseCode;

/**
 *<p>设备控制结果,将控制完成的设备返回到主机进行更新</p>
 */
public class ControlResult {
    //响应结果
    /**控制设备失败后的原因*/
    private String response;
    //控制后的实体信息
    /**控制设备后,设备的信息*/
    private Appliance appliance;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Appliance getAppliance() {
        return appliance;
    }

    public void setAppliance(Appliance appliance) {
        this.appliance = appliance;
    }
}
