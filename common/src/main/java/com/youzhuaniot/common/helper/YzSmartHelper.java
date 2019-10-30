package com.youzhuaniot.common.helper;


import com.annimon.stream.Stream;
import com.youzhuaniot.entity.VoiceCtrlCmd;
import com.youzhuaniot.entity.YzSmartDevice;

import java.util.List;


/**
 * 操作帮助类
 */
public final class YzSmartHelper {

	/**
	 * 根据设备Id 查询实体
	 * @param devices  数据集合
	 * @param devId  设备ID
	 * @return 查询到的数据
	 */
	public static YzSmartDevice findByDevId(List<YzSmartDevice> devices, String devId){
		if(devId == null){
			throw new RuntimeException("设备命令中的设备Id值不允许为空");
		}
		for (YzSmartDevice yzSmartDevice : devices) {
			if (devId.equals(yzSmartDevice.getDevId())) {
				return yzSmartDevice;
			}
		}
		return null;
	}

	public static List<YzSmartDevice> findByDevType(List<YzSmartDevice> yzSmartDevices, VoiceCtrlCmd voiceCtrlCmd){
		return Stream.of(yzSmartDevices)
				.filter(value -> voiceCtrlCmd.getRoom()==null
						|| voiceCtrlCmd.getRoom().equals(value.getYzRoom()))
				.filter(value -> voiceCtrlCmd.getZoom()==null
						|| voiceCtrlCmd.getZoom().equals(value.getYzZoom()))
				.filter(value -> voiceCtrlCmd.getDevType() == null
						|| voiceCtrlCmd.getDevType().equals(value.getDevType())
						|| voiceCtrlCmd.getDevType().equals(value.getDevSubType()))
				.toList();
	}

	//合并设备List
	public static List<YzSmartDevice> mergeDeviceList(List<YzSmartDevice> newList,List<YzSmartDevice> oldList){
		return Stream.of(newList)
				.flatMap(devList1 -> Stream.of(oldList))
				.distinct()
		.toList();
	}


}
