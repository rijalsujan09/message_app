package com.projectzero.app.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectzero.app.entity.Email;
import com.projectzero.app.service.EmailService;


@RestController
@RequestMapping("api/email")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping("send")
	public ResponseEntity<Email> sendEmail(@RequestBody Email email){
		
		String str =  UUID.randomUUID().toString();
		email.setId(str);
		Email myEmail = this.emailService.sendEmail(email);
		return new ResponseEntity<Email>(myEmail, HttpStatus.CREATED);
	}
	
	

}