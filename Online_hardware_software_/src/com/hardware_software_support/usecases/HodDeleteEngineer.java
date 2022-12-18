package com.hardware_software_support.usecases;

import java.util.Scanner;

import com.hardware_software_support.dao.HodDao;
import com.hardware_software_support.dao.HodDaoImpl;
import com.hardware_software_support.exceptions.EngineerException;

public class HodDeleteEngineer {

	public void hodDeleteEngineer() {
		System.out.println("Delete Engineer");
		System.out.println("=======================================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Engineer Id to delete the engineer record.");
		int engId = sc.nextInt();
		System.out.println("=======================================");
		HodDao dao = new HodDaoImpl();
		
		try {
			String res = dao.deleteEngineer(engId);
			System.out.println(res);
		} catch (EngineerException e) {
			System.out.println(e.getMessage());
		}
	}
}
