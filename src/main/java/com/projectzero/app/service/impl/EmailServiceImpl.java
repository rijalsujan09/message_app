package com.projectzero.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.projectzero.app.entity.Email;
import com.projectzero.app.repository.EmailRepository;
import com.projectzero.app.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private EmailRepository emailRepository;

	@Autowired
	private JavaMailSender mailSender;

	@Override
	public Email sendEmail(Email email) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email.getEmail());
		message.setSubject(email.getSubject());
		message.setText(email.getMessage());
		mailSender.send(message);
		return emailRepository.save(email);
	}

	@Override
	public Email getEmailById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Email> getAllEmail() {
		// TODO Auto-generated method stub
		return null;
	}

}
