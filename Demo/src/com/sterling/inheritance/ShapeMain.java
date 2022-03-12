package com.sterling.inheritance;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
		Shape s;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("What shape you want process ? R for Rectangle, S for Square ");
		String choice = sc.next();
		
		switch(choice) {
		   case "R":case "r":
			      s=new Rectangle("Rectangle",4,20,40);
			      s.show();
			      s.area();
			      break;
		   case "S":case "s":
			      s=new Square("Square",4,20);
			      s.show();
			      s.area();
		}
	}
}
