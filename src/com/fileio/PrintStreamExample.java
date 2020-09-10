package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) {
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("D:\\Cognizant\\testfile.txt");
			PrintStream pout = new PrintStream(fout);
			pout.println(2016);
			pout.println("Hello Java");
			pout.println("Welcome to Java learning");
			pout.close();
			fout.close();
			System.out.println("Write complete");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
