package com.youzhuaniot.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class YzSensorRecord implements Parcelable {

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

	protected YzSensorRecord(Parcel in) {
		vender = in.readString();
		statusRecordId = in.readString();
		uid = in.readString();
		deviceId = in.readString();
		sequence = in.readInt();
		value1 = in.readInt();
		value2 = in.readInt();
		value3 = in.readInt();
		value4 = in.readInt();
		createTime = in.readString();
		updateTime = in.readString();
		delFlag = in.readInt();
		text = in.readString();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(vender);
		dest.writeString(statusRecordId);
		dest.writeString(uid);
		dest.writeString(deviceId);
		dest.writeInt(sequence);
		dest.writeInt(value1);
		dest.writeInt(value2);
		dest.writeInt(value3);
		dest.writeInt(value4);
		dest.writeString(createTime);
		dest.writeString(updateTime);
		dest.writeInt(delFlag);
		dest.writeString(text);
	}

	@Override
	public int describeContents() {
		return 0;
	}

	public static final Creator<YzSensorRecord> CREATOR = new Creator<YzSensorRecord>() {
		@Override
		public YzSensorRecord createFromParcel(Parcel in) {
			return new YzSensorRecord(in);
		}

		@Override
		public YzSensorRecord[] newArray(int size) {
			return new YzSensorRecord[size];
		}
	};

	public YzSensorRecord(){}


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
