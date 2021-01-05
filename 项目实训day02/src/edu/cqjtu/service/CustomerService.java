package edu.cqjtu.service;

import edu.cqjtu.model.CustomerInfo;
import edu.cqjtu.utils.CustomerUtils;


public class CustomerService {
	
	private CustomerInfo[] cts;
	int totall=0;
	
	public CustomerService(int lenght) {
		cts = new CustomerInfo[lenght];
	}

	public void add_user() {
		System.out.print("������������");
		String name = CustomerUtils.readUserStr(20);
		System.out.print("���������䣺");
		int age = CustomerUtils.CheckUserSelect(0, 80);
		System.out.print("�������Ա�");
		char gender = CustomerUtils.readUserChar('f','m');
		System.out.print("������emial��");
		String email = CustomerUtils.readUserStr(40);
		CustomerInfo ct = new CustomerInfo(name, age, gender, email);
		System.out.println(putCustomerToArray(ct)?"�ɹ�":"ʧ��");
		
		
	}
	
	public boolean putCustomerToArray(CustomerInfo ct) {
		boolean flag = false;
		if (cts.length>1|| totall<=cts.length) {
			cts[totall++] = ct;
			flag = true;
		}
		return flag;
	}
	
	
	public void dispathRequest() {
		int select = CustomerUtils.CheckUserSelect(1,7);
		switch (select) {
		case 1:
			add_user();
			break;
		case 2:
			System.out.println("�޸�");
			break;
		case 3:
			delCustomer();
			break;
		case 4:
			showCustomer();
			break;
		case 5:
			System.out.println("����");
			break;
		case 6:
			System.exit(0);;
		}
	}

	//ɾ���û�
	private void delCustomer() {
		while (true) {
			// TODO Auto-generated method stub
			System.out.println("��ӭ����������棬������Ҫɾ�������кţ�");
			int userSlect = CustomerUtils.CheckUserSelect(1, cts.length);
			if (removeCustomerFromArray(userSlect)) {
				System.out.println("ɾ��ʧ��");
				continue;
			}
			System.out.println("ɾ���ɹ�");
		}
	}

	private boolean removeCustomerFromArray(int userSlect) {
		// TODO Auto-generated method stub
		if (cts[userSlect-1]==null || totall==0) {
			System.out.println("�Բ����ҵ��û�");
			return false;
		}
		System.out.print("��ȷ��Ҫɾ���� (y/n)");
		char c = CustomerUtils.readUserChar('y', 'n');
		if(c=='y') {
			cts[userSlect-1] = null;
			totall--;
			for(int i=0;i<cts.length-1;i++) {
				cts[i] = cts[i+1];
			}
			return true;
		}
		return false;
	}

	private void showCustomer() {
		System.out.println("id\tname\tage\tgender\temail");
		for (int i = 0; i < cts.length; i++) {
			if (cts[i] != null) {
				System.out.println(i + "\t" + cts[i]);
			}
		}
	}
}
