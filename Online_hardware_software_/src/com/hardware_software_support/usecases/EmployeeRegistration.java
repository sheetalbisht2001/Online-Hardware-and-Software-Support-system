package com.hardware_software_support.usecases;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hardware_software_support.dao.EmployeeDao;
import com.hardware_software_support.dao.EmployeeDaoImpl;
import com.hardware_software_support.exceptions.EmployeeException;

public class EmployeeRegistration {
	
	public void registerEmployee() {
		System.out.println("Employee Registration");
		System.out.println("=============================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter department id.");
		int deptId = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter your username.");
		String username = sc.next();
		System.out.println("Enter password. Password should have 8 to 20 characters without"
				+ "space and should include atleast 1 digit 1 uppercase 1 lowercase letter"
				+ "and a special character.");
		String password = sc.next();
		
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(password);
		
		if(m.matches()) {
			
			EmployeeDao dao = new EmployeeDaoImpl();
			
			try {
				String res = dao.registerEmployee(deptId, name, username, password);
				System.out.println(res);
			} catch (EmployeeException e) {
				System.out.println(e.getMessage());
			}
			
		}else {
			System.out.println("Password should have 8 to 20 characters without"
					+"space and should include atleast 1 digit 1 uppercase 1 lowercase letter"
					+"and a special character. Please try again.");
			
			registerEmployee();
		}
		
	}
}
