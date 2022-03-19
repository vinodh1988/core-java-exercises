package com.functional.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileStreamings {
   public static void main(String[] args) {
	   try {
		Files.lines(Paths.get("D:\\mypro.json")).forEach(x->{
			   System.out.println(x);
		   });
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
