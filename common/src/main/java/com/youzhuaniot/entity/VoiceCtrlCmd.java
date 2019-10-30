package com.youzhuaniot.entity;

/**
 * 语音参数命令类
 */
public class VoiceCtrlCmd extends YzCtrlCmd{

	//设备类型
	private String devType;
	//房间名,楼层名
	private String room,zoom;

	public String getDevType() {
		return devType;
	}

	public void setDevType(String devType) {
		this.devType = devType;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getZoom() {
		return zoom;
	}

	public void setZoom(String zoom) {
		this.zoom = zoom;
	}

	@Override
	public void clear(){
		super.clear();
		devType = null;
		zoom = null;
		room = null;
	}

	@Override
	public String toString() {
		return "VoiceCtrlCmd{" +
				"devType='" + devType + '\'' +
				", room='" + room + '\'' +
				", zoom='" + zoom + '\'' +
				'}'+super.toString();
	}
}
