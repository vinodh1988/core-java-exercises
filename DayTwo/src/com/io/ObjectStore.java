package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStore {
        public static void main(String[] args) {
			Emp e=new Emp(1,"Raj","Chennai");
			Emp e1=new Emp(1,"Ravi","Mumbai");
			Emp e2=new Emp(1,"Kiran","Bhopal");
			File f=new File("E:\\SpringCourse\\ObjectStore");
			try(FileOutputStream fout=new FileOutputStream(f);
				ObjectOutputStream oos	=new ObjectOutputStream(fout)){
				oos.writeObject(e);
				oos.writeObject(e1);
				oos.writeObject(e2);
				System.out.println("Employees stored.....");
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		}
}

//Storing object permenantly on a file is called serialization
//persisting the object is called serialization
