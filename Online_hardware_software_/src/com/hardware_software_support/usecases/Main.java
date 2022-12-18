package com.hardware_software_support.usecases;

import java.util.Scanner;

import com.hardware_software_support.exceptions.ComplaintException;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Online Hardware Software Support System.");
		System.out.println("=====================================================");
		System.out.println("Enter 1 if you are the HOD.");
		System.out.println("Enter 2 if you are an employee.");
		System.out.println("Enter 3 if you are a system engineer.");
		System.out.println("Enter 4 to exit");
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		System.out.println("================================");
		
		switch(choice) {
		
		case 1:
			System.out.println("HOD");
			System.out.println("=============================");
			HodLoginUsecase login = new HodLoginUsecase();
			login.useLoginHod();
			
			while(true) {
				System.out.println("Enter 1 to register a new Engineer.");
				System.out.println("Enter 2 to see the list of all registered engineers.");
				System.out.println("Enter 3 to delete any Engineer.");
				System.out.println("Enter 4 to see all raised complaints");
				System.out.println("Enter 5 to assign a complaint to an engineer.");
				System.out.println("Enter 6 to logout");
				
				int hodChoice=sc.nextInt();
				System.out.println("===================================");
				
				if(hodChoice==1) {
					HodRegisterEngineerUsecase reg = new HodRegisterEngineerUsecase();
					System.out.println("Register a new Engineer.");
					System.out.println("=============================================");
					reg.hodRegisterEngineer();
				}
					
				else if(hodChoice==2) {
					HodCheckEngineers chk = new HodCheckEngineers();
					System.out.println("Engineers List");
					System.out.println("=================================");
					chk.hodCheckEngineers();
				}				
					
				else if(hodChoice==3) {
					HodDeleteEngineer dlt = new HodDeleteEngineer();
					dlt.hodDeleteEngineer();
					System.out.println("====================================");
				}
							
				else if(hodChoice==4) {
					HodCheckComplaints chkCom = new HodCheckComplaints();
					System.out.println("All Complaints");
					System.out.println("=====================================");
					chkCom.hodCheckAllComplaints();
					System.out.println("=====================================");
				}
				
				else if(hodChoice==5) {
					HodAssignComplaintToEngineer assign = new HodAssignComplaintToEngineer();
					assign.assignToEngineer();
					System.out.println("=====================================");
				}
					
				else if(hodChoice==6) {
					Main.main(args);
				}
					
					
				else {
					System.out.println("Invalid choice. Please enter a correct choice.");
					System.out.println("====================================================");
				
				}
			}
			
		case 2:
			while(true) {
				System.out.println("Employee.");
				System.out.println("==================================================");
				System.out.println("Enter 1 to login if you are already registered.");
				System.out.println("Enter 2 to register to the system if you are a new employee.");
				System.out.println("Enter 3 to exit.");
				
				int empChoiceLogin = sc.nextInt();
				if(empChoiceLogin==1) {
					EmployeeLogin empLogin = new EmployeeLogin();
					int empIdLoggedin=empLogin.loginEmployee();
//					System.out.println(empIdLoggedin);
//********************Login Successful***************************************
					
					while(true) {
						System.out.println("Enter 1 to register a complaint.");
						System.out.println("Enter 2 to check status of a complaint.");
						System.out.println("Enter 3 to check complaint history.");
						System.out.println("Enter 4 to change password.");
						System.out.println("Enter 5 to logout.");
						
						int empChoice = sc.nextInt();
						System.out.println("==========================================");
						System.out.println("Employee.");
						System.out.println("===========================================");
						if(empChoice==1) {
							System.out.println("Raise Complaint.");
							System.out.println("=======================================");
							EmployeeRaiseComplaint empTicket = new EmployeeRaiseComplaint();
							empTicket.raiseComplaint(empIdLoggedin);
							System.out.println("========================================");
						}else if(empChoice==2) {
							EmployeeCheckComplaintStatus empStatus= new EmployeeCheckComplaintStatus();
							empStatus.checkCompStatus();
							System.out.println("==========================================");
						}else if(empChoice==3) {
							System.out.println("Complaint History");
							System.out.println("============================================");
							EmployeeCheckComplaintHistory empHis = new EmployeeCheckComplaintHistory();
							empHis.checkComplaintHistory(empIdLoggedin);
							System.out.println("=============================================");
						}else if(empChoice==4) {
							System.out.println("Change password.");
							System.out.println("=============================================");
							EmployeeChangePassword empChngPswrd = new EmployeeChangePassword();
							empChngPswrd.employeeChangePassword();
							System.out.println("=============================================");
							
						}else if(empChoice==5) {
							main(args);
						}
					}
					
				}else if(empChoiceLogin==2) {
					EmployeeRegistration empRegister = new EmployeeRegistration();
					empRegister.registerEmployee();
					System.out.println("============================================");
				}else if(empChoiceLogin==3){
					System.out.println("*****************************************");
					System.out.println("Thank you. Have a wonderful day");
					System.exit(0);
				}else {
					System.out.println("Invalid choice. Please try again.");
				}
			}
			
		case 3:
			System.out.println("System Engineer");
			System.out.println("==================================================");
			
			EngineerLogin engLogin = new EngineerLogin();
			int engIdLoggedin=engLogin.engineerLogin();
			System.out.println("=================================================");
			
//****************Login Successful*************************
			
			while(true) {
				
				System.out.println("Enter 1 to check complaints assigned.");
				System.out.println("Enter 2 to update the status of a complaint.");
				System.out.println("Enter 3 to see list of all the complaints attended.");
				System.out.println("Enter 4 to change password.");
				System.out.println("Enter 5 to logout.");
				
				int engChoice = sc.nextInt();
				if(engChoice==1) {
					EngineerCheckComplaintsAssigned engCompsAss = new EngineerCheckComplaintsAssigned();
					System.out.println("Complaints Assigned.");
					System.out.println("==============================================");
					try {
						engCompsAss.checkComplaintsAssigned(engIdLoggedin);
						System.out.println("==========================================");
					} catch (ComplaintException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					
				}else if(engChoice==2) {
					System.out.println("Update complaint status");
					System.out.println("==============================================");
					EngineerUpdateComplaintStatus engUpdateComplaint = new EngineerUpdateComplaintStatus();
					engUpdateComplaint.engUpdateComplaintStatus();
					System.out.println("==============================================");
					
				}else if (engChoice==3) {
					System.out.println("All complaints attended.");
					System.out.println("================================================");
					EngineerCheckComplaintsAttended engAttended = new EngineerCheckComplaintsAttended();
					engAttended.checkComplaintsAttended(engIdLoggedin);
					System.out.println("=================================================");
					
				}else if(engChoice==4) {
					System.out.println("Change password.");
					System.out.println("=================================================");
					EngineerChangePassword engChangePswrd = new EngineerChangePassword();
					engChangePswrd.engineerChangePassword();
					System.out.println("==================================================");
					
				}else if(engChoice==5) {
					
					main(args);
				}else {
					System.out.println("Invalid choice. Please try again.");
				}
			}
			
			
		case 4: 
			System.out.println("Thank you. Have a wonderful day.");
			System.exit(0);
		
		}
	}
}
