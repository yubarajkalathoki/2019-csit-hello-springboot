package com.csit.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

	@RequestMapping(value ="/karishma", method=RequestMethod.GET)
	public ResponseMessage hello() {
		ResponseMessage response = new ResponseMessage();
		response.setMessage("No Thanks.");
		response.setReason("I don't know");
		return response;
	}
	
	class ResponseMessage{
		private String message;
		private String reason;
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getReason() {
			return reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}

		
	}
}
