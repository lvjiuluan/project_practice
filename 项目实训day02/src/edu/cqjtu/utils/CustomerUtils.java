package edu.cqjtu.utils;

import java.util.Scanner;

public class CustomerUtils {

	private static Scanner scanner = new Scanner(System.in);

	public static void ShowMenu() {

		System.out.println("**********************");
		System.out.println("1、添加用户");
		System.out.println("2、修改用户");
		System.out.println("3、删除用户");
		System.out.println("4、用户列表");
		System.out.println("5、保存信息");
		System.out.println("6、退出");
		System.out.println("**********************");
		System.out.print("请选择：");
	}

	public static int CheckUserSelect(int minLimit,int maxLimint) {
		int select = 0;
		while (true) {
			try {
				String s1 = scanner.next();
				select = Integer.parseInt(s1);
			} catch (NumberFormatException e) {
				System.out.println("输入有误，请重新选择");
				continue;
			}
			if (select < minLimit || select > maxLimint) {
				System.out.println("输入有误，请重新选择");
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
				System.out.print("请输入1-20个字符");
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
				System.out.print("请重新输入，f 或 m");
				continue;
			}
			return g;
		}
	}
}
