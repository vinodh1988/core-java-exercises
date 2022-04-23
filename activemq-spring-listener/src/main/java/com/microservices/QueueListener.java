package com.microservices;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueListener {

	@JmsListener(destination="FirstQueue")
	public void receive(String message) {
		System.out.println(message);
	}
}
