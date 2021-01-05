package edu.cqjtu.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaServer {
	public static void main(String[] args) {
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		try {

			ServerSocket ss = new ServerSocket(8888);
			Socket socket = ss.accept();

			// ������������
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "UTF-8");
			br = new BufferedReader(isr);
			String line = br.readLine();
			System.out.println(line);
			
			// ��Ӧ�������
			OutputStream out = socket.getOutputStream();
			osw = new OutputStreamWriter(out, "UTF-8");
			String str = "��ã��ͻ���";
			osw.write(str);
			
			osw.flush(); //�ȶ�һ��
			socket.shutdownOutput();//��ʾ��˵����
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				osw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
