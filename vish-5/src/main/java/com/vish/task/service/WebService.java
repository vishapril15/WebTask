package com.vish.task.service;

import java.util.List;

import com.vish.task.webtask.WebTask;

public interface WebService {
	
	public String createDetails(WebTask webTask);
	public String updateDetails(WebTask webTask);
	public String deleteDetails(String tId);
	public WebTask getDetails(String tId);
	public List<WebTask> getAllDetails();
	

}
