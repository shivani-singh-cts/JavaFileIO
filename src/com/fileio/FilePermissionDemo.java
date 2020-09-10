package com.fileio;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermissionDemo {

	public static void main(String[] args) {
		String src = "D:\\Cognizant\\testfile.txt";
		FilePermission file1 = new FilePermission(src, "read, write");
		PermissionCollection permission = file1.newPermissionCollection();
		permission.add(file1);
		
		if(permission.implies(new FilePermission(src, "read, write")))
			System.out.println("Read, Write permission granted to "+ src);
		else
			System.out.println("No read write permission to "+ src);
	}

}
