package com.youzhuaniot.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 控制指令实体
 */
public class YzCtrlCmd implements Serializable {

	//设备指令
	private String order;
	//设备Id  如果是语音控制则不需要填写
	private String devId;
	//设备属性参数,除开关命令外,设备有特殊属性时需添加对应参数值
	private Map<String,String> attr = new HashMap<>();
//	private List<YzAttribute> yzAttributes;
	// 扩展参数
	private String expand;



	public Map<String, String> getAttr() {
		return attr;
	}


	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}



	public String getDevId() {
		return devId;
	}

	public void setDevId(String devId) {
		this.devId = devId;
	}

	public void addAttr(String key,String value){
		 attr.put(key,value);
	}

	public boolean existAttr(String key){
		return attr.containsKey(key);
	}

	public String getAttrValue(String key){
		return attr.get(key);
	}

	public void clearAttr(){
		attr.clear();
	}

	public void clear(){
		order = null;
		devId = null;
		attr.clear();
		expand = null;
	}
	@Override
	public String toString() {
		return "YzCtrlCmd{" +
				"order='" + order + '\'' +
				", devId='" + devId + '\'' +
				", attr=" + attr +
				", expand='" + expand + '\'' +
				'}';
	}
}
