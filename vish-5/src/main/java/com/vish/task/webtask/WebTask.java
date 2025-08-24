package com.vish.task.webtask;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="webtask_info")
public class WebTask {

	@Id
	private String tId;
	private String tName;
	private String tTitle;
	private String tDes;
	
	public WebTask()
	{
		
	}
	public WebTask(String tId, String tName, String tTitle, String tDes) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tTitle = tTitle;
		this.tDes = tDes;
	}
	
	
	public String gettId() {
		return tId;
	}
	public void settId(String tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String gettTitle() {
		return tTitle;
	}
	public void settTitle(String tTitle) {
		this.tTitle = tTitle;
	}
	public String gettDes() {
		return tDes;
	}
	public void settDes(String tDes) {
		this.tDes = tDes;
	}
	
}
