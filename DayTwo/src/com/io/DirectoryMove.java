package com.io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryMove {
     public static void main(String[] args) {
		Path p=Paths.get("e:\\SpringCourse");
	
		try {
			DirectoryStream<Path> d=Files.newDirectoryStream(p,"*");
			for(Path x:d) {
				System.out.println(x+ " Copied to "+"D:\\Files");
			    Path p1=Paths.get("D:\\Files\\"+x.getFileName());
			    Files.copy(x,p1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
