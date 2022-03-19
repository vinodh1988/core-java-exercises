package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Filecopy {

	  public static void main(String[] args) {
		Path p=Paths.get("E:\\SpringCourse\\Demo.zip");
		Path p1=Paths.get("D:\\Files\\Dist.zip");
		
		try {
			Files.copy(p, p1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
