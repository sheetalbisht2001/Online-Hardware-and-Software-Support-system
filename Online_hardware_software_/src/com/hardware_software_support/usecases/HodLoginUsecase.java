package com.hardware_software_support.usecases;

import java.util.Scanner;

import com.hardware_software_support.dao.HodDao;
import com.hardware_software_support.dao.HodDaoImpl;
import com.hardware_software_support.exceptions.HodException;
import com.hardware_software_support.model.Hod;

public class HodLoginUsecase {
	
	public void useLoginHod() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();
		System.out.println("==================================");
		
		HodDao dao = new HodDaoImpl();
		
		try {
			Hod hod = dao.loginHod(username, password);
			System.out.println("Welcome "+ hod.getName());
			System.out.println("======================================");
			
		} catch (HodException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("===========================================");
			useLoginHod();
		}
	}
}
