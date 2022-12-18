package com.hardware_software_support.usecases;

import java.util.ArrayList;
import java.util.List;

import com.hardware_software_support.dao.HodDao;
import com.hardware_software_support.dao.HodDaoImpl;
import com.hardware_software_support.exceptions.ComplaintException;
import com.hardware_software_support.model.Complaints;

public class HodCheckComplaints {

	public void hodCheckAllComplaints() {
		
		List<Complaints> comps = new ArrayList<>();
		
		HodDao dao = new HodDaoImpl();
		
		try {
			comps = dao.checkComplaints();
			comps.forEach(comp -> System.out.println(comp));
		} catch (ComplaintException e) {
			System.out.println(e.getMessage());
		} 
	}
}
