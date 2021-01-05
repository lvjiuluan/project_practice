package edu.cqjtu.iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOtest {
	public static void main(String[] args) {
		try {
			String string = "hello";
			//FileInputStream in = new FileInputStream("");
			FileOutputStream out = new FileOutputStream("d:/temp.txt");
			try {
				out.write(string.getBytes());
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("文件找不到");
		}
	}
}
