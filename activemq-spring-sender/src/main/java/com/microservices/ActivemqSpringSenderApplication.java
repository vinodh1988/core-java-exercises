package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class ActivemqSpringSenderApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(ActivemqSpringSenderApplication.class, args);
		JmsTemplate  jms=ac.getBean(JmsTemplate.class);
		while(true) {
			long id=Math.round(Math.random()*10000);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(id==9495)
				break;
			jms.convertAndSend("FirstQueue","Message Pattern is changed,.... "+id);
		}
		
	}

}
