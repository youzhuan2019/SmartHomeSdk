package com.youzhuaniot.entity;


public class YzSensorRecord  {

	private String vender;
	private String statusRecordId;
	private String uid;
	private String deviceId;
	private int sequence;
	private int value1;
	private int value2;
	private int value3;
	private int value4;
	private String createTime;
	private String updateTime;
	private int delFlag;
	private String text;


	public String getVender() {
		return vender;
	}

	public void setVender(String vender) {
		this.vender = vender;
	}

	public String getStatusRecordId() {
		return statusRecordId;
	}

	public void setStatusRecordId(String statusRecordId) {
		this.statusRecordId = statusRecordId;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}

	public int getValue3() {
		return value3;
	}

	public void setValue3(int value3) {
		this.value3 = value3;
	}

	public int getValue4() {
		return value4;
	}

	public void setValue4(int value4) {
		this.value4 = value4;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public int getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(int delFlag) {
		this.delFlag = delFlag;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
