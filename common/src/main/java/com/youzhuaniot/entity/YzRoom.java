package com.youzhuaniot.entity;

/**
 * 房间实体
 */
public class YzRoom {
	private String id;
	private String roomName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	@Override
	public String toString() {
		return "YzRoom{" +
				"id='" + id + '\'' +
				", roomName='" + roomName + '\'' +
				'}';
	}
}
