package com.youzhuaniot.entity;

import android.os.Build;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 设备实体
 */
public class YzSmartDevice implements Serializable {
	//设备唯一标识
	private String devId;
	//设备名称
	private String devName;
	//设备昵称
	private String devNickName;
	//设备类型
	private String devType;
	//设备子类型
	private String devSubType;
	//设备厂商
	private String devVendor;
	//设备区域
	private String yzZoom;
	//设备房间
	private String yzRoom;
	//设备描述
	private String description;
	//设备图片
	private String pic;
	//扩展字段
	private String extension;
	//设备是否在线
	private boolean isOnline;

	public void set(YzSmartDevice newValue){
		this.devId = newValue.getDevId();
		this.devName = newValue.getDevName();
		this.devNickName = newValue.getDevNickName();
		this.devType = newValue.getDevType();
		this.devSubType = newValue.getDevSubType();
		this.devVendor = newValue.getDevVendor();
		this.yzZoom = newValue.getYzZoom();
		this.yzRoom = newValue.getYzRoom();
		this.description = newValue.getDescription();
		this.pic = newValue.getPic();
		this.extension = newValue.getExtension();
		this.isOnline = newValue.isOnline();
		this.devAttr = null;
		this.devAttr = newValue.getYzDevAttr();
	}

	//设备属性
	private Map<String,String> devAttr = new HashMap<>();

	public Map<String, String> getYzDevAttr() {
		return devAttr;
	}

	public void setDevAttr(Map<String, String> devAttr) {
		this.devAttr = devAttr;
	}

	public String getDevId() {
		return devId;
	}


	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getDevNickName() {
		return devNickName;
	}

	public void setDevNickName(String devNickName) {
		this.devNickName = devNickName;
	}

	public String getDevType() {
		return devType;
	}

	public void setDevType(String devType) {
		this.devType = devType;
	}

	public String getDevSubType() {
		return devSubType;
	}

	public void setDevSubType(String devSubType) {
		this.devSubType = devSubType;
	}


	public String getDevVendor() {
		return devVendor;
	}

	public void setDevVendor(String devVendor) {
		this.devVendor = devVendor;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean online) {
		isOnline = online;
	}

	public String getYzZoom() {
		return yzZoom;
	}

	public void setYzZoom(String yzZoom) {
		this.yzZoom = yzZoom;
	}

	public String getYzRoom() {
		return yzRoom;
	}

	public void setYzRoom(String yzRoom) {
		this.yzRoom = yzRoom;
	}



	@Override
	public String toString() {
		return "YzSmartDevice{" +
				"devId='" + devId + '\'' +
				", devName='" + devName + '\'' +
				", devNickName='" + devNickName + '\'' +
				", devType='" + devType + '\'' +
				", devSubType='" + devSubType + '\'' +
				", devVendor='" + devVendor + '\'' +
				", yzZoom='" + yzZoom + '\'' +
				", yzRoom='" + yzRoom + '\'' +
				", description='" + description + '\'' +
				", pic='" + pic + '\'' +
				", extension='" + extension + '\'' +
				", isOnline=" + isOnline +
				", devAttr=" + getYzDevAttr().toString() +
				'}';
	}

	/**
	 * 重写equels 用 设备Id 判断是否为同一个设备
	 * @param obj
	 * @return
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof YzSmartDevice){
			String id = ((YzSmartDevice) obj).getDevId();
			return this.getDevId() != null && this.getDevId().equals(id);
		}else{
			return false;
		}
	}

	public boolean existAttr(String key) {
		return getYzDevAttr().containsKey(key);
	}

	public String getAttr(String key) {
		return getYzDevAttr().get(key);
	}

	public void addAttr(String key,String value) {
		 getYzDevAttr().put(key,value);
	}

	@Override
	public int hashCode() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
			return Objects.hash(devId, devName, devNickName, devType,
					devSubType, devVendor,
					yzZoom, yzRoom, description, pic,
					extension, isOnline, devAttr);
		}else{
			Object[] objs = {devId, devName, devNickName, devType,
					devSubType, devVendor,
					yzZoom, yzRoom, description, pic,
					extension, isOnline, devAttr};
			return Arrays.hashCode(objs);
		}
	}


}
