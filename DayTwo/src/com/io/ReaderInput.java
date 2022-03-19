package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderInput {
     public static void main(String n[]) {
    	 InputStreamReader input=new InputStreamReader(System.in);
    	 BufferedReader br=new BufferedReader(input);
    	  try {
    		System.out.println("Enter a String and Integer");
  			String string=br.readLine();
  			Integer integer =Integer.parseInt(br.readLine());
  			System.out.println(string+" "+integer);
  		} catch (IOException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
     }
}
