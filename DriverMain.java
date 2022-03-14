package com.gl.main;

import java.util.Scanner;
import com.gl.employee.Employee;
import com.gl.service.CredentialServices;


public class DriverMain {
	
	Employee employee = new Employee("Silky", "Lalwani");
	CredentialServices ser = new CredentialServices();
	
	String generatedEmailId;
	char[] generatedPassword;
	
	System.out.println("Please enter the department from the following");
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. Human Resource");
	System.out.println("4. Legal");
	
	
	Scanner sc=new Scanner(System.in);
	int option;
    option=sc.nextInt();
    
    
    switch(option) {
    case1:
    	System.out.println("Technical Department");
		generatedEmailId = ser.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "tech");
		generatedPassword = ser.generatePassword();
		ser.showCredentials(employee, generatedEmailId, generatedPassword);

    	break;
    case2:
    	System.out.println("Admin");
		generatedEmailId = ser.generateEmailAddress(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(), "admin");
		generatedPassword = ser.generatePassword();
		ser.showCredentials(employee, generatedEmailId, generatedPassword);

    	break;
    case3:
    	System.out.println("HR");
    	
    	generatedEmailId = ser.generateEmailAddress(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(), "hr");
    	generatedPassword = ser.generatePassword();
		ser.showCredentials(employee, generatedEmailId, generatedPassword);

    	break;
    case4:
    	System.out.println("Legal");
    	
    	generatedEmailId = ser.generateEmailAddress(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(), "admin");
    	generatedPassword = ser.generatePassword();
		ser.showCredentials(employee, generatedEmailId, generatedPassword);

    	break;
    default:
    	System.out.println("Sorry! Invalid option.Please enter a valid option");
   
    }
}