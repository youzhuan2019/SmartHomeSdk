package com.youzhuaniot.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;


public class YzSensorRecordGroup{

	private String deviceId;
	private String sensorGroupName;
	private List<YzSensorRecord> mSensorRecord;

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getSensorGroupName() {
		return sensorGroupName;
	}

	public void setSensorGroupName(String sensorGroupName) {
		this.sensorGroupName = sensorGroupName;
	}

	public List<YzSensorRecord> getmSensorRecord() {
		return mSensorRecord;
	}

	public void setmSensorRecord(List<YzSensorRecord> mSensorRecord) {
		this.mSensorRecord = mSensorRecord;
	}
}
