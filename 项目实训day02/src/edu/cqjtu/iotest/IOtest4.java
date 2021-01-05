package edu.cqjtu.iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class IOtest4 {
	public static void main(String[] args) {

		FileOutputStream out = null;
		FileInputStream in = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		try {
			in = new FileInputStream("d:/utf_test.txt");
			out = new FileOutputStream("d:/utf_test_copy.txt");
			isr = new InputStreamReader(in, "UTF-8");
			osw = new OutputStreamWriter(out, "UTF-8");
			char[] b = new char[5];
			int len = 0;
			while ((len = isr.read(b)) != -1) {
//				osw.write(b, 0, len);
				osw.write(b, 0, len);
				System.out.println(len);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				isr.close();
				osw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
