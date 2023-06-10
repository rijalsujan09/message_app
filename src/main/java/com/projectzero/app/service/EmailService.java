package com.projectzero.app.service;

import java.util.List;

import com.projectzero.app.entity.Email;

public interface EmailService {
	
	Email sendEmail(Email email);
	
	Email getEmailById(String id);
	
	List<Email>  getAllEmail();

}