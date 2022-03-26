package com.solution;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.JavaConfig;
import com.system.Task;
//application context maintains the bean as singleton
public class MainApp {
   public static void main(String[] args) {
	  ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
	/*  System.out.println("enter play for gaming, cook for Cooking, study for studying ");
	  Scanner sc=new Scanner(System.in);
	  String option = sc.next();
	  Task t=(Task)ac.getBean(option);
	  t.perform();
	  System.out.printf("\n HashCode: %x", t.hashCode());
	  t=(Task)ac.getBean(option);
	  System.out.printf("\n HashCode: %x", t.hashCode());*/
	 
   }
}
