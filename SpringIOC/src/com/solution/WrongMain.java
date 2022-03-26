package com.solution;

import java.util.Scanner;

import com.system.Cook;
import com.system.Play;
import com.system.Study;

public class WrongMain {
   public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("What do you want to do 1. play 2. Study 3. Cook ");
	  Byte b=Byte.parseByte(sc.next());
	  switch(b) {
	  case 1:
		     Play p=new Play();
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
