package com.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriter {

	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("D:\\Cognizant\\testfile.txt");
			String content = "Java Reader Writer Example";
			w.write(content);
			w.close();
			System.out.println("Write Complete!");
			
			Reader r = new FileReader("D:\\Cognizant\\testfile.txt");
			int data = r.read();
			while(data != -1) {
				System.out.print((char)data);
				data = r.read();
			}
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
