package com.hardware_software_support.dao;

import java.util.List;

import com.hardware_software_support.exceptions.ComplaintException;
import com.hardware_software_support.exceptions.EngineerException;
import com.hardware_software_support.model.Complaints;
import com.hardware_software_support.model.Engineer;

public interface EngineerDao {
	
	public Engineer loginEngineer(String username, String password) throws EngineerException;
	
	public List<Complaints> checkAssignedComplaints(int engId) throws ComplaintException;
	
	public String updateComplaintStatus(int complaintId, String newStatus) throws ComplaintException;
	
	public List<Complaints> checkComplaintsAttended(int engId) throws ComplaintException;
	
	public String changeEngineerPassword(String username, String oldPassword, String newPassword) throws EngineerException;
}
