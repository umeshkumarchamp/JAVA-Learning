package com.umesh.File;

import java.io.File; 

public class FileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("D:\\Anudip Foundation\\Eclipse\\FileInputOutput\\abcd.txt");
		
		String re = file.exists()? "File Exists" : "File not exist."; 
		
		System.out.println(re);
		
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getParent());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		System.out.println(file.getClass());

	}

}
