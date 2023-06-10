package com.projectzero.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectzero.app.entity.SMS;
import com.projectzero.app.repository.SmsRepository;
import com.projectzero.app.service.SmsService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@Service
public class SmsServiceImpl  implements SmsService{
	
	// Your Twilio account SID and auth token
    public static final String ACCOUNT_SID = "your ssid";
    public static final String AUTH_TOKEN = "your token";
	
	@Autowired
	private SmsRepository repository;

	@Override
	public SMS sendSms(SMS sms) {
		String msg =  sms.getSubject()+"\n"+sms.getMessage();
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message message = Message.creator(
				new PhoneNumber(sms.getPhone()),
				new PhoneNumber("+18778498644"), 
				msg).create();
		return this.repository.save(sms);
	}

}
