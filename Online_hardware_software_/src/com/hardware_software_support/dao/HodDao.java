package com.hardware_software_support.dao;

import java.util.List;

import com.hardware_software_support.exceptions.ComplaintException;
import com.hardware_software_support.exceptions.EngineerException;
import com.hardware_software_support.exceptions.HodException;
import com.hardware_software_support.model.Complaints;
import com.hardware_software_support.model.Engineer;
import com.hardware_software_support.model.Hod;

public interface HodDao {
	
	public Hod loginHod(String username, String password) throws HodException;
	
	public String registerEngineer(String name, String username, String password, String type, String location) throws EngineerException;
	
	public List<Engineer> getEngineers() throws EngineerException;
	
	public String deleteEngineer(int engId) throws EngineerException;
	
	public List<Complaints> checkComplaints() throws ComplaintException;
	
	public String assignComplaintToEngineer(int complaintId, int engId) throws EngineerException;
}
