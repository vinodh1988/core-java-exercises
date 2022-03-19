package com.io;

import java.io.DataInputStream;
import java.io.IOException;

public class IODemo {
	 public static void main(String[] args) {
		  DataInputStream input=new DataInputStream(System.in);
		  System.out.println("Please Give a String and Integer input");
		  try {
			String string=input.readLine();
			Integer integer =Integer.parseInt(input.readLine());
			System.out.println(string+" "+integer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

}

/*

    Input - Input Device [Disk,Keyboard] , Files, Network, Database
    Output - output device [printer,monitor] , files, Network ,Database
    
    For Database operations java.io package doesnot offer any solution
    
    For networking features java has an exclusive package java.net which could be coupled with java.io
    
    Input Devices and files java.io packages addresses solution
    
    Generally java process input and output in the form of streams [collection of bytes]
    
    Collection of bytes is treated in binary format it is called  Byte Stream
    
       ByteStream is suitable for dealing with non text files, network data,  reading binary information
       
     Collection of bytes is treated as characters it is called Character Stream
       
       this is best suitable for dealing with text Data
       
     If you are dealing with input and if you are dealing with the same with byte Stream java
     offers various classes the super class for all such classes is InputStream
     
     If you are dealing with input and if you are dealing  the same with Character Stream java
     offers various classes the super class for all such classes is Reader
     
      If you are dealing with output and if you are dealing  the same with Character Stream java
     offers various classes the super class for all such classes is Writer
     
      If you are dealing with output and if you are dealing  the same with byte Stream java
     offers various classes the super class for all such classes is OutputStream



*/