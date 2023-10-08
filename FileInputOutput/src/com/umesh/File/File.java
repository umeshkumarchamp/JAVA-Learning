package com.umesh.File;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileOutputStream fout = null; 
		BufferedOutputStream bout = null; 
		try {
			fout = new FileOutputStream("newFile.txt",true); 
			bout = new BufferedOutputStream(fout); 
			System.out.println("File Created Successfully.");
			
			StringBuffer st1 = new StringBuffer("Champ"); 
			st1.append("\tKumar");
			System.out.println(st1);
			
			try {
				String name = "Umesh Kumar\t"; 
				String mob = "6201033951\n";  
				String nm = name.concat(mob);
				byte val[] = nm.getBytes();
				fout.write(val);
				bout.write(val);
				bout.flush();
				System.out.println("Write Successfully.");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fout!= null || bout!= null) {
					fout.close();
					bout.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
