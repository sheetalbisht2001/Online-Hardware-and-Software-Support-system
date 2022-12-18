package com.hardware_software_support.model;

import java.util.Date;

public class EmployeeComplaintsDTO {
	
	private int empId;
	private int deptid;
	private String name;
	private String userName;
	private String password;
	private int complaintId;
	private String complaintType;
	private int engId;
	private String status;
	private Date dateRaised;
	private String dateResolved;
	
	public EmployeeComplaintsDTO() {}

	public EmployeeComplaintsDTO(int empId, int deptid, String name, String userName, String password, int complaintId,
			String complaintType, int engId, String status, Date dateRaised, String dateResolved) {
		this.empId = empId;
		this.deptid = deptid;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.complaintId = complaintId;
		this.complaintType = complaintType;
		this.engId = engId;
		this.status = status;
		this.dateRaised = dateRaised;
		this.dateResolved = dateResolved;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public int getEngId() {
		return engId;
	}

	public void setEngId(int engId) {
		this.engId = engId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateRaised() {
		return dateRaised;
	}

	public void setDateRaised(Date dateRaised) {
		this.dateRaised = dateRaised;
	}

	public String getDateResolved() {
		return dateResolved;
	}

	public void setDateResolved(String dateResolved) {
		this.dateResolved = dateResolved;
	}

	@Override
	public String toString() {
		return "EmployeeComplaintsDTO [empId=" + empId + ", deptid=" + deptid + ", name=" + name + ", userName="
				+ userName + ", password=" + password + ", complaintId=" + complaintId + ", complaintType="
				+ complaintType + ", engId=" + engId + ", status=" + status + ", dateRaised=" + dateRaised
				+ ", dateResolved=" + dateResolved + "]";
	}
	
	
	
	
}
