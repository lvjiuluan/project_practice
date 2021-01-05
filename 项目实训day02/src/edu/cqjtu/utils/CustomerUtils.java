package edu.cqjtu.utils;

import java.util.Scanner;

public class CustomerUtils {

	private static Scanner scanner = new Scanner(System.in);

	public static void ShowMenu() {

		System.out.println("**********************");
		System.out.println("1������û�");
		System.out.println("2���޸��û�");
		System.out.println("3��ɾ���û�");
		System.out.println("4���û��б�");
		System.out.println("5��������Ϣ");
		System.out.println("6���˳�");
		System.out.println("**********************");
		System.out.print("��ѡ��");
	}

	public static int CheckUserSelect(int minLimit,int maxLimint) {
		int select = 0;
		while (true) {
			try {
				String s1 = scanner.next();
				select = Integer.parseInt(s1);
			} catch (NumberFormatException e) {
				System.out.println("��������������ѡ��");
				continue;
			}
			if (select < minLimit || select > maxLimint) {
				System.out.println("��������������ѡ��");
				continue;
			}
			break;
		}
		return select;
	}

	public static String readUserStr(int maxLimit) {
		String name=null;
		while (true) {
			name = scanner.next();
			if (name.length() < 1 || name.length() > maxLimit) {
				System.out.print("������1-20���ַ�");
				continue;
			}
			break;
		}
		return name;
	}
	
	public static char readUserChar(char c1, char c2)
	{
		char g = 0;
		while (true) {
			String string=scanner.next();
			g = string.charAt(0);
			if (g!=c1&& g!=c2) {
				System.out.print("���������룬f �� m");
				continue;
			}
			return g;
		}
	}
}
