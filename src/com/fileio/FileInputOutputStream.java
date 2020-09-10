package com.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\testfile.txt");

			String s = "Hello World!";
			byte[] b = s.getBytes();
			fout.write(b);
			System.out.println("Data Written!");
			fout.close();
			
			FileInputStream fin = new FileInputStream("D:\\testfile.txt");
			int i = 0;
			while((i = fin.read()) != -1)
				System.out.print((char)i);
			System.out.println("\nFile Read Completed");
			fin.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
