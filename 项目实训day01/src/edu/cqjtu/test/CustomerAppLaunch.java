package edu.cqjtu.test;

import edu.cqjtu.service.CustomerService;
import edu.cqjtu.utils.CustomerUtils;

public class CustomerAppLaunch {
	
	private static CustomerService service = new CustomerService(3);
	
	public static void main(String[] args) {
		while (true) {
			CustomerUtils.ShowMenu();
			service.dispathRequest();
		}
	}
}
