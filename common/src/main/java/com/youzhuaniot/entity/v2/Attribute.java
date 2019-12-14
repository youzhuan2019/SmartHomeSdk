package com.youzhuaniot.entity.v2;

/**
 * 设备的属性信息
 */
public class Attribute {
	//属性名称，支持数字、字母和下划线
	private String name;
	//属性值
	private String value;
	//属性值的单位名称
	private String scale;
	//属性值取样的时间戳，单位是秒。
	private long timestampOfSample;
	//属性值取样的时间误差，单位是ms。如果设备使用的是轮询时间间隔的取样方式，
	// 那么uncertaintyInMilliseconds就等于时间间隔。
	// 如温度传感器每1秒取样1次，那么uncertaintyInMilliseconds的值就是1000。
	private long uncertaintyInMilliseconds;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public long getTimestampOfSample() {
		return timestampOfSample;
	}

	public void setTimestampOfSample(long timestampOfSample) {
		this.timestampOfSample = timestampOfSample;
	}

	public long getUncertaintyInMilliseconds() {
		return uncertaintyInMilliseconds;
	}

	public void setUncertaintyInMilliseconds(long uncertaintyInMilliseconds) {
		this.uncertaintyInMilliseconds = uncertaintyInMilliseconds;
	}
}
