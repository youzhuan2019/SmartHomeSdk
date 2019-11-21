package com.youzhuaniot.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;


public class YzSensorRecordGroup implements Parcelable {

	private String sensorGroupName;
	private List<YzSensorRecord> mSensorRecord;

	protected YzSensorRecordGroup(Parcel in) {
		sensorGroupName = in.readString();
		mSensorRecord = in.createTypedArrayList(YzSensorRecord.CREATOR);
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(sensorGroupName);
		dest.writeTypedList(mSensorRecord);
	}

	@Override
	public int describeContents() {
		return 0;
	}

	public static final Creator<YzSensorRecordGroup> CREATOR = new Creator<YzSensorRecordGroup>() {
		@Override
		public YzSensorRecordGroup createFromParcel(Parcel in) {
			return new YzSensorRecordGroup(in);
		}

		@Override
		public YzSensorRecordGroup[] newArray(int size) {
			return new YzSensorRecordGroup[size];
		}
	};

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
	public YzSensorRecordGroup(){}
}
