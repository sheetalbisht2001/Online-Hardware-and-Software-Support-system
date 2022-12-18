package com.hardware_software_support.usecases;

import java.util.List;

import com.hardware_software_support.dao.EngineerDao;
import com.hardware_software_support.dao.EngineerDaoImpl;
import com.hardware_software_support.exceptions.ComplaintException;
import com.hardware_software_support.model.Complaints;

public class EngineerCheckComplaintsAssigned {

	public void checkComplaintsAssigned(int engId) throws ComplaintException {
		
		EngineerDao dao = new EngineerDaoImpl();
		try {
			List<Complaints> complaintsAssigned = dao.checkAssignedComplaints(engId);
			if(complaintsAssigned.isEmpty()) {
				System.out.println("No new complaints assigned.");
			}else
			complaintsAssigned.forEach(comps -> System.out.println(comps));
		} catch (ComplaintException e) {
			// TODO Auto-generated catch block
			throw new ComplaintException("No complaints assigned.");
		}
		
	}
}
