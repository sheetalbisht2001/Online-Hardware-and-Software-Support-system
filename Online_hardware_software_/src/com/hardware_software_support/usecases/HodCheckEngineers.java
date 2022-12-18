package com.hardware_software_support.usecases;

import java.util.List;

import com.hardware_software_support.dao.HodDao;
import com.hardware_software_support.dao.HodDaoImpl;
import com.hardware_software_support.exceptions.EngineerException;
import com.hardware_software_support.model.Engineer;

public class HodCheckEngineers {
	
	public void hodCheckEngineers() {
		HodDao dao = new HodDaoImpl();
		
		try {
			List<Engineer> engs = dao.getEngineers();
			engs.forEach(eng -> System.out.println(eng));
			System.out.println("===============================");
			
		} catch (EngineerException e) {
			System.out.println(e.getMessage());
		}
	}
}
