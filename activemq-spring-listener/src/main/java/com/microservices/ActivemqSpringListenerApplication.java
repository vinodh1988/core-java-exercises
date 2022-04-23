package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActivemqSpringListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqSpringListenerApplication.class, args);
	}

}
