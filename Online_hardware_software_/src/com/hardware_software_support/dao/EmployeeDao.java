package com.hardware_software_support.dao;

import java.util.List;

import com.hardware_software_support.exceptions.ComplaintException;
import com.hardware_software_support.exceptions.EmployeeException;
import com.hardware_software_support.model.Complaints;
import com.hardware_software_support.model.Employee;
import com.hardware_software_support.model.EngineerComplaintsDTO;

public interface EmployeeDao {

	public String registerEmployee(int deptid, String name, String username, String password) throws EmployeeException;
	
	public Employee loginEmployee(String username, String password) throws EmployeeException;
	
	public int raiseComplaint(int empId, String compType) throws ComplaintException;
	
	public EngineerComplaintsDTO checkComplaintStatus(int complaintId) throws ComplaintException;
	
	public List<Complaints> checkComplaintHistory(int empId) throws ComplaintException;
	
	public String changeEmployeePassword(String username, String oldPassword, String newPassword) throws EmployeeException;
	
}
