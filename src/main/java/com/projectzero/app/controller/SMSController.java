package com.projectzero.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectzero.app.entity.SMS;
import com.projectzero.app.service.SmsService;

@RestController
@RequestMapping("/api/sms")
public class SMSController {
	
	@Autowired
	private SmsService smsService;
	
	@PostMapping("/send")
	public ResponseEntity<SMS> sendSmsNotification(@RequestBody SMS sms){
		SMS sentSms = this.smsService.sendSms(sms);
		return new ResponseEntity<SMS>(sentSms, HttpStatus.CREATED);
	}

}
