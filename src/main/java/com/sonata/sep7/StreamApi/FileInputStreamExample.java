package com.sonata.sep7.StreamApi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {
public static void main(String[] args) throws IOException {
	FileOutputStream fos = new FileOutputStream("D://test.txt");
	FileInputStream fis =new FileInputStream("D://test.txt");
	byte b=85;
	int i=10;
	char c;
	try {
		fos.write(b);
		while((i=fis.read())!=-1) {
			c=(char)i;
			System.out.println(c);
		}
	}finally {
		if(fos!=null)
			fos.close();
		if(fis!=null)
			fis.close();
	}
		

	}

}
