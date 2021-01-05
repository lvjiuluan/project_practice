package edu.cqjtu.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class JavaClient {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		BufferedReader br = null;
		try {
			Socket socket = new Socket("127.0.0.1", 8888);
			OutputStream out = socket.getOutputStream();
			osw = new OutputStreamWriter(out, "UTF-8");
			osw.write("你好服务器");
			osw.flush();
			socket.shutdownOutput();//表示我说完了
			
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "UTF-8");
			br = new BufferedReader(isr);
			String line = br.readLine();
			System.out.println(line);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				osw.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
