package com.youzhuaniot.entity.v2;

import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 *  智能家居协议实体
 */
public class Appliance implements Parcelable {
	//设备标识符。标识符在用户拥有的所有设备上必须是唯一的。此外，
	// 标识符需要在同一设备的多个发现请求之间保持一致
	private String applianceId;
	//设备支持的操作类型数组。详细情况请参见
	private String[] actions;
	//支持的设备、场景类型。目前支持以下设备。
	private String[] applianceTypes;
	//设备名称
	private String deviceName;
	//用户用来识别设备的名称。 是字符串类型
	private String friendlyName;
	//设备相关的描述，描述内容提需要提及设备厂商，使用场景及连接方式，
	private String friendlyDescription;
	//设备厂商的名字。
	private String manufacturerName;
	//提供的图片
	private String icon;
	//设备型号名称
	private String model;
	//设备型号名称
	private String modelName;
	//放置区域
	private String zone;
	//放置楼层
	private String floor;
	//软件版本
	private String version;
	//设备当前是否能够到达。true表示设备当前可以到达，false表示当前设备不能到达。
	private boolean isReachable;
	//设备的属性信息。当设备没有属性信息时，协议中不需要传入该字段。
	// 每个设备允许同步的最大的属性数量是10。详细信息请参考设备属性及设备属性上报。
	private List<Attribute> attributes;
	//提供给设备云使用，存放设备或场景相关的附加信息，是键值对
	private JSONObject additionalApplianceDetails;
	private String vendorId;

	public Appliance(){}

	protected Appliance(Parcel in) {
		applianceId = in.readString();
		actions = in.createStringArray();
		applianceTypes = in.createStringArray();
		deviceName = in.readString();
		friendlyName = in.readString();
		friendlyDescription = in.readString();
		manufacturerName = in.readString();
		icon = in.readString();
		model = in.readString();
		modelName = in.readString();
		zone = in.readString();
		floor = in.readString();
		version = in.readString();
		isReachable = in.readByte() != 0;
		vendorId = in.readString();
		attributes =  JSON.parseArray(in.readString(),Attribute.class);
		additionalApplianceDetails = JSON.parseObject(in.readString());
	}

	public static final Creator<Appliance> CREATOR = new Creator<Appliance>() {
		@Override
		public Appliance createFromParcel(Parcel in) {
			return new Appliance(in);
		}

		@Override
		public Appliance[] newArray(int size) {
			return new Appliance[size];
		}
	};

	public String getApplianceId() {
		return applianceId;
	}

	public void setApplianceId(String applianceId) {
		this.applianceId = applianceId;
	}

	public String[] getActions() {
		return actions;
	}

	public void setActions(String... actions) {
		this.actions = actions;
	}

	public String[] getApplianceTypes() {
		return applianceTypes;
	}

	public void setApplianceTypes(String... applianceTypes) {
		this.applianceTypes = applianceTypes;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public String getFriendlyDescription() {
		return friendlyDescription;
	}

	public void setFriendlyDescription(String friendlyDescription) {
		this.friendlyDescription = friendlyDescription;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		if(floor != null){
			this.floor = floor;
		}
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean isReachable() {
		return isReachable;
	}

	public void setReachable(boolean reachable) {
		isReachable = reachable;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Appliance){
			String id = ((Appliance) obj).getApplianceId();
			return this.getApplianceId() != null && this.getApplianceId().equals(id);
		}else{
			return false;
		}
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public JSONObject getAdditionalApplianceDetails() {
		return additionalApplianceDetails;
	}

	public void setAdditionalApplianceDetails(JSONObject additionalApplianceDetails) {
		this.additionalApplianceDetails = additionalApplianceDetails;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(applianceId);
		dest.writeStringArray(actions);
		dest.writeStringArray(applianceTypes);
		dest.writeString(deviceName);
		dest.writeString(friendlyName);
		dest.writeString(friendlyDescription);
		dest.writeString(manufacturerName);
		dest.writeString(icon);
		dest.writeString(model);
		dest.writeString(modelName);
		dest.writeString(zone);
		dest.writeString(floor);
		dest.writeString(version);
		dest.writeByte((byte) (isReachable ? 1 : 0));
		dest.writeString(vendorId);
		dest.writeString(JSON.toJSONString(attributes));
		dest.writeString(JSON.toJSONString(additionalApplianceDetails));
	}

}
