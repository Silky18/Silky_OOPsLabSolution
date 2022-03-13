package credentialgenerator;
import java.util.Scanner;
import credentialgenerator.Employee;


public class Driver {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the department of the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");

		System.out.println("Dear  your generated credentials are as follows");
		
		//parameterised constructor of class Employee
		
		Employee emp=new Employee("Silky","Lalwani");
		
		Services ser=new Services();
	
		
		int option;
	    option=sc.nextInt();
    	
	    String generatedEmailId;
		char[] generatedPassword;

    	switch(option) {
	    case 1:
	    	System.out.println("Technical Department");
			generatedEmailId = ser.generateEmailAddress(emp.getFirstname().toLowerCase(),emp.getLastname().toLowerCase(), "tech");
			generatedPassword = ser.generatePassword();
			ser.showCredentials(emp, generatedEmailId, generatedPassword);

	    	break;
	    case 2:
	    	System.out.println("Admin");
			generatedEmailId = ser.generateEmailAddress(emp.getFirstname().toLowerCase(),
					emp.getLastname().toLowerCase(), "admin");
			generatedPassword = ser.generatePassword();
			ser.showCredentials(emp, generatedEmailId, generatedPassword);

	    	break;
	    case 3:
	    	System.out.println("HR");
	    	
	    	generatedEmailId = ser.generateEmailAddress(emp.getFirstname().toLowerCase(),
					emp.getLastname().toLowerCase(), "hr");
	    	generatedPassword = ser.generatePassword();
			ser.showCredentials(emp, generatedEmailId, generatedPassword);

	    	break;
	    case 4:
	    	System.out.println("Legal");
	    	
	    	generatedEmailId = ser.generateEmailAddress(emp.getFirstname().toLowerCase(),
					emp.getLastname().toLowerCase(), "admin");
	    	generatedPassword = ser.generatePassword();
			ser.showCredentials(emp, generatedEmailId, generatedPassword);

	    	break;
	    default:
	    	System.out.println("Sorry! Invalid option.Please enter a valid option");
	   
	    }
	   
    	sc.close();
    	}

}
