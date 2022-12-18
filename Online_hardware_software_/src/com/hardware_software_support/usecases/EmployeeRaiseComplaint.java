package com.hardware_software_support.usecases;

import java.util.Scanner;

import com.hardware_software_support.dao.EmployeeDao;
import com.hardware_software_support.dao.EmployeeDaoImpl;
import com.hardware_software_support.exceptions.ComplaintException;

public class EmployeeRaiseComplaint {

	public void raiseComplaint(int empId) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 if Hardware Complaint.");
		System.out.println("Press 2 if Software Complaint.");
		int compChoice = sc.nextInt();
		String compType="Not mentioned";
		if(compChoice==1) compType="Hardware";
		
		else if(compChoice==2) compType ="Software";
		
		else {
			System.out.println("Invalid Choice. Please try again.");
			System.out.println("==================================");
			raiseComplaint(empId);
		}
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			int compId = dao.raiseComplaint(empId, compType);
			System.out.println("Complaint Id: "+ compId +" Please keep this handy to check complaint status.");
		} catch (ComplaintException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
