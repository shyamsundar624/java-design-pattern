package com.shyam.design.service;

import org.springframework.stereotype.Component;

//This is 3rd party class - different method singature, can't be changed
@Component
public class SmsGatewayService {

	public void dispatchSms(String phoneNumber,String countryCode,String textBody) {
		System.out.println("SMS dispatched to ["+countryCode+ phoneNumber+ "]: "+textBody);
	}
}
