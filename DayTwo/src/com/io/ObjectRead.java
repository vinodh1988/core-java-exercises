package com.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectRead {
   public static void main(String[] args) {
	   File f=new File("E:\\SpringCourse\\ObjectStore");
		try(FileInputStream fin=new FileInputStream(f);
			ObjectInputStream ois	=new ObjectInputStream(fin)){
             
			while(true)
				System.out.println(ois.readObject());
			
		}
		catch(EOFException e) {
			System.out.println("File Reading completed....");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
   }
}
