package com.umesh.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileWriter fw = new FileWriter("abcd.txt")){
			
			fw.write("Umesh Kumar");
			
			System.out.println("Data Saved.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
