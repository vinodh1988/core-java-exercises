package com.solution;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.JavaConfig;
import com.system.Task;

public class MainApp {
   public static void main(String[] args) {
	  ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
	  System.out.println("enter play for gaming, cook for Cooking, study for studying ");
	  Scanner sc=new Scanner(System.in);
	  Task t=(Task)ac.getBean(sc.next());
	  t.perform();
   }
}
