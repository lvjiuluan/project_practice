package edu.cqjtu.iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOtest2 {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("d:/temp.txt");
			//int c = in.read();  //输出
			byte[] b = new byte[5];
			int c = in.read(b); //c的值为5
			for (int i = 0; i < b.length; i++) {
				char c1 = (char) b[i];
				System.out.print(c1);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
