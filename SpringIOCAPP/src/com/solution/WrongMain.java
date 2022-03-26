package com.solution;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.JavaConfig;
import com.system.Cook;
import com.system.Play;
import com.system.Study;
import com.system.Task;

public class WrongMain {
	 public static void main(String[] args) {
		  ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
		  System.out.println("enter play for gaming, cook for Cooking, study for studying ");
		  Scanner sc=new Scanner(System.in);
		  Task t=(Task)ac.getBean(sc.next());
		  t.perform();
	   }
   public static void main(int[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("What do you want to do 1. play 2. Study 3. Cook ");
	  Byte b=Byte.parseByte(sc.next());
	  switch(b) {
	  case 1:
		     Play p=new Play(); //Reference Type
		                            //Creating objects to establish Dependency
		     p.perform();
		     break;
	  case 2:
		     Study s=new Study();
		     s.perform();
		     break;
	  case 3:
	         Cook c=new Cook();
	         c.perform();
	         break;
	  }
   }
}
