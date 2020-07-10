package com.youzhuan.iot.constant;

/**
 * <p>描述设备支持的action,对应{@link com.youzhuan.iot.model.Appliance#setActions(String...)}中的actions字段</p>
 */
public interface YzDevAction {
    /**
     * 打开
     */
    String turnOn = "turnOn";//： 打开
    /**
     * 定时打开
     */
    String timingTurnOn = "timingTurnOn";//： 定时打开
    /**
     * 关闭
     */
    String turnOff = "turnOff";//： 关闭
    /**
     * 定时关闭
     */
    String timingTurnOff = "timingTurnOff";//： 定时关闭
    /**
     * 暂停
     */

    String pause = "pause";//： 暂停
    /**
     * 继续
     */

    String _continue = "continue"; //： 继续
    /**
     * 设置灯光亮度
     */

    String setBrightnessPercentage = "setBrightnessPercentage";//： 设置灯光亮度
    /**
     * 调亮灯光
     */

    String incrementBrightnessPercentage = "incrementBrightnessPercentage";//： 调亮灯光
    /**
     * 调暗灯光
     */

    String decrementBrightnessPercentage = "decrementBrightnessPercentage";//： 调暗灯光
    /**
     * 增高灯光色温
     */

    String incrementColorTemperature = "incrementColorTemperature"; //： 增高灯光色温
    /**
     * 降低灯光色温
     */

    String decrementColorTemperature = "decrementColorTemperature";//： 降低灯光色温
    /**
     * 设置灯光色温
     */

    String setColorTemperature = "setColorTemperature";//： 设置灯光色温
    /**
     * 升高温度
     */

    String incrementTemperature = "incrementTemperature";//升高温度
    /**
     * 降低温度
     */

    String decrementTemperature = "decrementTemperature";//降低温度
    /**
     * 设置温度
     */

    String setTemperature = "setTemperature";//设置温度
    /**
     * 调高音量
     */

    String incrementVolume = "incrementVolume";//调高音量
    /**
     * 调低音量
     */

    String decrementVolume = "decrementVolume";//调低音量
    /**
     * 设置音量
     */

    String setVolume = "setVolume";//设置音量
    /**
     * 设置设备静音状态
     */

    String setVolumeMute = "setVolumeMute";//设置设备静音状态
    /**
     * 增加风速
     */

    String incrementFanSpeed = "incrementFanSpeed";//增加风速
    /**
     * 减小风速
     */

    String decrementFanSpeed = "decrementFanSpeed";//减小风速

    /**
     * 设置风速
     */
    String setFanSpeed = "setFanSpeed";//设置风速

    /**
     * 设置模式
     */
    String setMode = "setMode";//设置模式

//    /**取消设置的模式*/
//    String unSetMode = "unSetMode";//取消设置的模式
//    /**定时设置模式*/
//    String timingSetMode = "timingSetMode";//定时设置模式
//    /**定时取消设置的模式*/
//    String timingUnsetMode = "timingUnsetMode";//定时取消设置的模式
    /**
     * 设置颜色
     */
    String setColor = "setColor";//设置颜色
    /**
     * 查询空气质量
     */
    String getAirQualityIndex = "getAirQualityIndex";//查询空气质量
    /**
     * 查询PM2.5
     */
    String getAirPM25 = "getAirPM25";//查询PM2.5
    /**
     * 查询温度
     */
    String getTemperatureReading = "getTemperatureReading";//查询温度
    /**
     * 查询目标温度
     */
    String getTargetTemperature = "getTargetTemperature";//查询目标温度
    /**
     * 查询湿度
     */
    String getHumidity = "getHumidity";//查询湿度
    /**
     * 查询剩余时间
     */
    String getTimeLeft = "getTimeLeft";//查询剩余时间
    /**
     * 查询运行时间
     */
    String getRunningTime = "getRunningTime";//查询运行时间
    /**
     * 查询运行状态
     */
    String getRunningStatus = "getRunningStatus";//查询运行状态
    /**
     * 查询水质
     */
    String getWaterQuality = "getWaterQuality";//查询水质
    /**
     * 设置湿度模式
     */
    String setHumidity = "setHumidity";//设置湿度模式
    /**
     * 上锁解锁
     */
    String setLockState = "setLockState";//上锁解锁
    /**
     * 查询锁状态
     */
    String getLockState = "getLockState";//查询锁状态
    /**
     * 增大功率
     */
    String incrementPower = "incrementPower";//增大功率
    /**
     * 减小功率
     */
    String decrementPower = "decrementPower";//减小功率
    /**
     * 返回上个频道
     */
    String returnTVChannel = "returnTVChannel";//返回上个频道
    /**
     * 上一个频道
     */
    String decrementTVChannel = "decrementTVChannel";//上一个频道
    /**
     * 下一个频道
     */
    String incrementTVChannel = "incrementTVChannel";//下一个频道
    /**
     * 设置频道
     */
    String setTVChannel = "setTVChannel";//设置频道
    /**
     * 降低高度
     */
    String decrementHeight = "decrementHeight";//降低高度
    /**
     * 升高高度
     */
    String incrementHeight = "incrementHeight";//升高高度
    /**
     * 设置移动方向
     */
    String setDirection = "setDirection";//设置移动方向
    /**
     * 查询电量
     */
    String getElectricityCapacity = "getElectricityCapacity";//查询电量
    /**
     * 设备启动
     */
    String engineStartUp = "engineStartUp";// 设备启动
    /**
     * 设备定时
     */
    String setTimer = "setTimer";// 设备定时
    /**
     * 取消设备定时
     */
    String timingCancel = "timingCancel";//取消设备定时
}
