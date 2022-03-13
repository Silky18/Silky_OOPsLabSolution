package credentialgenerator;
import credentialgenerator.Employee;
import java.util.Random;



public class Services {
	Employee emp=new Employee("Silky","Lalwani");
	
	public char[] generatePassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;

		// Using random method
		Random random = new Random();

		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			password[i] = values.charAt(random.nextInt(values.length()));
			}
		return password;
	}


	
	public  String generateEmailAddress(String firstname,String lastname,String department){
				String emailId=firstname+lastname+"@"+department+".gl.com";
				return emailId;
		
	}
	public void showCredentials(Employee employee, String emailId, char[] generatedPassword){
	System.out.println("Dear"+emp.getFirstname()+"your generated credentials are as follows");
	System.out.println("Email id is:"+emailId);
	System.out.println("Password is:"+generatedPassword);
	
	}
}