package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Paste the path of the file");
		String path = sc.next();
		System.out.println("Enter the name of the file");
		String name=sc.next();
		
		File f=new File(path+name);
		try(FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr)){
			 String n=null;
			 while((n=br.readLine())!=null)
				 System.out.println(n);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
