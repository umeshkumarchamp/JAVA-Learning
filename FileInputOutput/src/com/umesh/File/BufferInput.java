package com.umesh.File;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null; 
		BufferedInputStream bin = null; 
		try {
			fis = new FileInputStream("D:\\Anudip Foundation\\Eclipse\\FileInputOutput\\newFile.txt"); 
			bin = new BufferedInputStream(fis); 
			System.out.println("File opened.");
			try {
				int val; 
				while((val = bin.read()) != -1) {
					System.out.println((char)val);
				}
				int value = bin.read(); 
				System.out.println(value);
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null || bin != null) {
					fis.close();
					bin.close();
				}
			}catch(IOException e ) {
				e.printStackTrace();
			}
		}

	}

}
