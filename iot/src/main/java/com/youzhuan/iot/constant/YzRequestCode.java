package com.youzhuan.iot.constant;

import androidx.annotation.StringDef;

import com.youzhuan.iot.model.ControlRequest;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * <p>主机端请求标识 {@link ControlRequest#getType()}</p>
 */
@StringDef({
        YzRequestCode.TurnOnRequest,
        YzRequestCode.TurnOffRequest,
        YzRequestCode.PauseRequest,
        YzRequestCode.SetTemperatureRequest,
        YzRequestCode.SetFanSpeedRequest,
        YzRequestCode.SetModeRequest,
        YzRequestCode.SetFanDirectionRequest,
        YzRequestCode.SetColorRequest,
        YzRequestCode.UnsetModeRequest
})
@Documented
@Retention(SOURCE)
@Target({METHOD, PARAMETER, FIELD, LOCAL_VARIABLE})
public @interface YzRequestCode {
    //设备发现
//    /**设备发现*/
//    String DiscoverAppliancesRequest = "DiscoverAppliancesRequest";
    //开
    /**开*/
    String TurnOnRequest = "TurnOnRequest";
    //关
    /**关*/
    String TurnOffRequest = "TurnOffRequest";
    //暂停
    /**暂停*/
    String PauseRequest = "PauseRequest";
    //设置温度
    /**设置温度*/
    String SetTemperatureRequest = "SetTemperatureRequest";
    //设置风速
    /**设置风速*/
    String SetFanSpeedRequest = "SetFanSpeedRequest";
    //设置模式
    /**设置模式*/
    String SetModeRequest = "SetModeRequest";
    /**取消模式*/
    String UnsetModeRequest = "UnsetModeRequest";
    //设置风向
    /**设置风向*/
    String SetFanDirectionRequest = "SetFanDirectionRequest";
    //设置颜色
    /**设置颜色*/
    String SetColorRequest = "SetColorRequest";

}
