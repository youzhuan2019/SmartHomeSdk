package com.youzhuaniot.entity.v2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Appliance {
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
	private String floor = "一";
	//软件版本
	private String version;
	//设备当前是否能够到达。true表示设备当前可以到达，false表示当前设备不能到达。
	private boolean isReachable;
	//设备的属性信息。当设备没有属性信息时，协议中不需要传入该字段。
	// 每个设备允许同步的最大的属性数量是10。详细信息请参考设备属性及设备属性上报。
	private Attribute[] attributes;
	//提供给设备云使用，存放设备或场景相关的附加信息，是键值对
	private Map<String,Object> additionalApplianceDetails;
	private String vendorId;
	private HashMap<String,Attribute> attributeHashMap;

	public String getApplianceId() {
		return applianceId;
	}

	public void setApplianceId(String applianceId) {
		this.applianceId = applianceId;
	}

	public String[] getActions() {
		return actions;
	}

	public void setActions(String[] actions) {
		this.actions = actions;
	}

	public String[] getApplianceTypes() {
		return applianceTypes;
	}

	public void setApplianceTypes(String[] applianceTypes) {
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

	public Attribute[] getAttributes() {
		return attributes;
	}

	public void setAttributes(Attribute[] attributes) {
		this.attributes = attributes;
		if(attributeHashMap== null){
			attributeHashMap = new HashMap<>();
		}
		for(Attribute attribute:this.attributes){
			attributeHashMap.put(attribute.getName(),attribute);
		}
	}

	public Map<String, Object> getAdditionalApplianceDetails() {
		return additionalApplianceDetails;
	}

	public void setAdditionalApplianceDetails(Map<String, Object> additionalApplianceDetails) {
		this.additionalApplianceDetails = additionalApplianceDetails;
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

	public Attribute getAttribute(String key) {
		if(attributeHashMap!=null){
			return attributeHashMap.get(key);
		}else{
			return null;
		}
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
}
