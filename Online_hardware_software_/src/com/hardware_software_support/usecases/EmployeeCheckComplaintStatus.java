package com.hardware_software_support.usecases;

import java.util.Scanner;

import com.hardware_software_support.dao.EmployeeDao;
import com.hardware_software_support.dao.EmployeeDaoImpl;
import com.hardware_software_support.exceptions.ComplaintException;
import com.hardware_software_support.model.EngineerComplaintsDTO;

public class EmployeeCheckComplaintStatus {
	
	public void checkCompStatus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your complaint id to check status");
		int compId = sc.nextInt();
		System.out.println("=======================================");
		System.out.println("Complaint status:- ");
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			EngineerComplaintsDTO dto =  dao.checkComplaintStatus(compId);
			System.out.println("ComplaintId: " + dto.getComplaintId());
			System.out.println("Complaint Type: " + dto.getComplaintType());
			System.out.println("Engineer id: " + dto.getEngId());
			System.out.println("Engineer name: " + dto.getName());
			System.out.println("Status: " + dto.getStatus());
			System.out.println("Date raised: " + dto.getDateRaised());
		} catch (ComplaintException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
