package GummyRegister;
import GummyRegister.RegisteringUser;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("WELCOME TO GUMMY REGISTRATION");
		String rules = "1-You must be over 18\n"
				+ "2-You must have paid Gummy's monthly Price\n"
				+ "3-You must enter your email";
		String message = "You must fulfill all the conditions";
		
		
		while(true) {
			System.out.println("*********************************");
			System.out.println(rules);
			System.out.println("*********************************");
			
			RegisteringUser rUser = new RegisteringUser();
			System.out.println("Your age is  controlling right now...");
			Thread.sleep(3000);
				if(rUser.ageControl() == false) {
					System.out.println(message);
					continue;
				}
				
			System.out.println("Your monthlyPrice is controlling right now...");
			Thread.sleep(3000);
				if(rUser.monthlyPriceControl() == false) {
					System.out.println(message);
					continue;
				}
			System.out.println("Your email is controlling right now...");
			Thread.sleep(3000);
				if(rUser.emailControl() == false) {
					System.out.println(message);
					continue;
				}
			
			System.out.println("Your transactions are successful , you registered Gummy WELCOME!!");	
			break;
		}
		
		
		
		
		
		
	}

}
