package com.youzhuan.iot.model;

/**
 * <p>
 *    运行服务的配置信息
 * </p>
 */
public class SdkInfoConfig {

    /**是否支持登录*/
    private boolean supportLogin;
    //厂商名称
    /**厂商名称*/
    private String manufacturerName;

    public boolean isSupportLogin() {
        return supportLogin;
    }

    public void setSupportLogin(boolean supportLogin) {
        this.supportLogin = supportLogin;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
}
