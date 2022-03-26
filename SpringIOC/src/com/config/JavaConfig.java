package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.system.Cook;
import com.system.Play;
import com.system.Study;
import com.system.Task;

@Configuration
public class JavaConfig {

	 @Bean("play")
	 public Task getPlay() {
		 return new Play();
	 }
	 
	 @Bean("cook")
	 public Task getCook() {
		 return new Cook();
	 }
	 
	 @Bean("study")
	 public Task getStudy() {
		 return new Study();
	 }
}
