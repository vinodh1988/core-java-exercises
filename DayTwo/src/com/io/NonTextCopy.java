package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class NonTextCopy {
     public static void main(String arg[]) {
    	Scanner sc=new Scanner(System.in);
 		System.out.println("Paste the path of the file");
 		String path = sc.next();
 		System.out.println("Enter the name of the file");
 		String name=sc.next();
 		File f=new File(path+name);
 	
 		
 		try(FileInputStream fi=new FileInputStream(f);
 			FileOutputStream fo=new FileOutputStream(new File("D:\\Files\\"+name))){
 		    int size = (int) f.length();
 		    byte[] b=new byte[size];
 		    fi.read(b);
 		    fo.write(b);
 		}
 		catch(IOException e) {
 			e.printStackTrace();
 		}
 		sc.close();
     }
}
