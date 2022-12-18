package com.hardware_software_support.usecases;

import java.util.List;

import com.hardware_software_support.dao.EmployeeDao;
import com.hardware_software_support.dao.EmployeeDaoImpl;
import com.hardware_software_support.exceptions.ComplaintException;
import com.hardware_software_support.model.Complaints;

public class EmployeeCheckComplaintHistory {

	public void checkComplaintHistory(int empId) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			List<Complaints> complaints = dao.checkComplaintHistory(empId);
			complaints.forEach(comp -> System.out.println(comp));
		} catch (ComplaintException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
