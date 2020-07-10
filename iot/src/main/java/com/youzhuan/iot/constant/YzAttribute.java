package com.youzhuan.iot.constant;

import com.alibaba.fastjson.JSONObject;

/**
 * <p>该常量类对应于{@link com.youzhuan.iot.model.Appliance#setAttributes(JSONObject)}</p>
 *
 */
public interface YzAttribute {
    /**
     * 开关
     */
    String turnOnState = "turnOnState";
    /**亮度*/
    String brightness = "brightness";
    /**饱和度*/
    String saturation = "saturation";
    /**颜色*/
    String color = "color";
    /**温度*/
    String temperature = "temperature";
    /**模式*/
    String mode = "mode";
    /**风速具体数值*/
    String fanSpeedValue = "fanSpeedValue";
    /**风速档位*/
    String fanSpeedLevel = "fanSpeedLevel";
    /**风向*/
    String fanDirection = "fanDirection";
    /**暂停状态*/
    String pauseState = "pauseState";
}
