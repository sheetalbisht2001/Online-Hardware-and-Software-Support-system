package com.hardware_software_support.usecases;

import java.util.Scanner;

import com.hardware_software_support.dao.EngineerDao;
import com.hardware_software_support.dao.EngineerDaoImpl;
import com.hardware_software_support.exceptions.EngineerException;
import com.hardware_software_support.model.Engineer;

public class EngineerLogin {

	public int engineerLogin() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		System.out.println("===================================");
		
		EngineerDao dao = new EngineerDaoImpl();
		int engId = 0;
		
		try {
			Engineer eng = dao.loginEngineer(username, password);
			System.out.println("Welcome " + eng.getName());
			engId=eng.getEngId();
		} catch (EngineerException e) {
			System.out.println(e.getMessage());
			engineerLogin();
		}
		return engId;
	}
}
