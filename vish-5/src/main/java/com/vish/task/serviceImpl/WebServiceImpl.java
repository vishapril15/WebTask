package com.vish.task.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vish.task.repository.WebRepository;
import com.vish.task.service.WebService;
import com.vish.task.webtask.WebTask;

@Service
public class WebServiceImpl implements WebService{
	
WebRepository webRepository;

	public WebServiceImpl(WebRepository webRepository) {
	super();
	this.webRepository = webRepository;
}

	@Override
	public String createDetails(WebTask webTask) {
		webRepository.save(webTask);
		return "Success";
	}

	@Override
	public String updateDetails(WebTask webTask) {
		webRepository.save(webTask);
		return "Success";
	}

	@Override
	public String deleteDetails(String tId) {
       webRepository.deleteById(tId);
		return "Success";
	}

	@Override
	public WebTask getDetails(String tId) {
		
		return webRepository.findById(tId).get();
	}

	@Override
	public List<WebTask> getAllDetails() {

		return webRepository.findAll();
	}
	

}
