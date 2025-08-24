package com.vish.task.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vish.task.service.WebService;
import com.vish.task.webtask.WebTask;

@RestController
@RequestMapping("/webtask")
public class WebController {
	
	WebService webService;

	public WebController(WebService webService) {
		super();
		this.webService = webService;
	}
	
	@GetMapping("{tId}")
public WebTask getDetails(@PathVariable("tId") String tId)
{
	return webService.getDetails(tId);	
}
	@GetMapping
	public List<WebTask> getAllDetails()
	{
		return webService.getAllDetails();
	}
	
	@PostMapping
	public String creatDetails( @RequestBody WebTask webTask)
	{
		webService.createDetails(webTask);
		return "Task Created succefull";
	}
	@PutMapping
	public String updateTasDetail(@RequestBody WebTask webTask)
	{
		webService.updateDetails(webTask);
	return "Update Successfull";
	}
	@DeleteMapping("{tId}")
	public String deleteTaskDetails(@PathVariable("tId") String tId)
	{
		webService.deleteDetails(tId);
		return "Delete Successful";
	}
}
