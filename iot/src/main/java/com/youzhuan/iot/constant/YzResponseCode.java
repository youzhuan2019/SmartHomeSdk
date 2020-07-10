package com.youzhuan.iot.constant;


import androidx.annotation.StringDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * <p>返回给主机的response值 {@link com.youzhuan.iot.model.ControlResult#setResponse(String)}</p>
 */
@StringDef({
        YzResponseCode.TurnOnConfirmation,
        YzResponseCode.TurnOffConfirmation,
        YzResponseCode.PauseConfirmation,
        YzResponseCode.SetTemperatureConfirmation,
        YzResponseCode.SetModeConfirmation,
        YzResponseCode.SetFanSpeedConfirmation,
        YzResponseCode.SetColorConfirmation,
        YzResponseCode.SetFanDirectionConfirmation,
})
@Retention(RetentionPolicy.SOURCE)
public @interface YzResponseCode {
    /**设备打开成功*/
    String TurnOnConfirmation = "TurnOnConfirmation";
    /**设备关闭成功*/
    String TurnOffConfirmation = "TurnOnConfirmation";
    /**设备暂停成功*/
    String PauseConfirmation = "PauseConfirmation";
    /**设置温度成功*/
    String SetTemperatureConfirmation = "SetTemperatureConfirmation";
    /**设备模式成功*/
    String SetModeConfirmation = "SetModeConfirmation";
    /**设备风速成功*/
    String SetFanSpeedConfirmation = "SetFanSpeedConfirmation";
    /**设备颜色/亮度/饱和度/根据设置的属性值决定成功*/
    String SetColorConfirmation = "    SetColorConfirmation";
    /**设备风向成功*/
    String SetFanDirectionConfirmation = "SetFanDirectionConfirmation";
}
