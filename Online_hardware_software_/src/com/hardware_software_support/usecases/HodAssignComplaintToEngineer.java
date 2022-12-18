package com.hardware_software_support.usecases;

import java.util.Scanner;

import com.hardware_software_support.dao.HodDao;
import com.hardware_software_support.dao.HodDaoImpl;
import com.hardware_software_support.exceptions.EngineerException;

public class HodAssignComplaintToEngineer {

	public void assignToEngineer() {
		Scanner sc = new Scanner(System.in);
		HodDao dao = new HodDaoImpl();
		System.out.println("Assign a complaint to an engineer");
		System.out.println("========================================");
		
		System.out.println("Enter complaint id to be assigned.");
		int compId = sc.nextInt();
		System.out.println("Enter engineer id to assign the complaint.");
		int engId = sc.nextInt();
		
		try {
			String res = dao.assignComplaintToEngineer(compId, engId);
			System.out.println(res);
		} catch (EngineerException e) {
			System.out.println(e.getMessage());
		}
	}
}
