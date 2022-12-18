package com.hardware_software_support.usecases;

import java.util.Scanner;

import com.hardware_software_support.dao.EngineerDao;
import com.hardware_software_support.dao.EngineerDaoImpl;
import com.hardware_software_support.exceptions.ComplaintException;

public class EngineerUpdateComplaintStatus {
	
	public void engUpdateComplaintStatus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter complaint id to update status.");
		int complaintId = sc.nextInt();
		System.out.println("Enter 1 to set status as In Progress.");
		System.out.println("Enter 2 to set status as Resolved.");
		String newStatus = "";
		int status = sc.nextInt();
		if(status==1) {
			newStatus = "In Progress";
			EngineerDao dao = new EngineerDaoImpl();
			try {
				String res = dao.updateComplaintStatus(complaintId, newStatus);
				System.out.println(res);
			} catch (ComplaintException e) {
				System.out.println(e.getMessage());
			}
		}else if(status==2) {
			newStatus = "Resolved";
			EngineerDao dao = new EngineerDaoImpl();
			try {
				String res = dao.updateComplaintStatus(complaintId, newStatus);
				System.out.println(res);
			} catch (ComplaintException e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("Invalid choice. Please try again.");
		}
	}
}
