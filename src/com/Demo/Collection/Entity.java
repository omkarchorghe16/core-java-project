package com.Demo.Collection;

public class Entity {

	int entityId;
	int EntityCode;
	String timeStamp;
	
	public Entity(int entityId, int entityCode, String timeStamp) {
		super();
		this.entityId = entityId;
		this.EntityCode = entityCode;
		this.timeStamp = timeStamp;
	}
	public int getEntityId() {
		return entityId;
	}
	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}
	public int getEntityCode() {
		return EntityCode;
	}
	public void setEntityCode(int entityCode) {
		EntityCode = entityCode;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
}
