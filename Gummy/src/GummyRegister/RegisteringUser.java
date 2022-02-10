package GummyRegister;
import java.util.Scanner;

import GummyRegister.RegisterRules;



public class RegisteringUser implements RegisterRules {
		
	private int age;
	private String creditCardNumber;
	private String creditCardSecurityCode;
	private boolean monthlyPrice;
	private boolean email;
	
	public RegisteringUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age:");
		this.age = input.nextInt();
		input.nextLine();
		System.out.println("Enter your credit card number:");
		this.creditCardNumber = input.nextLine();
		
			if(this.creditCardNumber.length() > 20 || this.creditCardNumber.length() <= 0) {
				this.monthlyPrice = false;
			}
			else {
				this.monthlyPrice = true;
			}
		System.out.println("Enter your credit card's security code:");
		this.creditCardSecurityCode = input.nextLine();
		
			if(this.creditCardSecurityCode.length() > 5 || this.creditCardSecurityCode.length() <= 0) {
				this.monthlyPrice = false;
			}
			else {
				this.monthlyPrice = true;
			}
		System.out.println("Enter your e-mail:");
		String answer = input.nextLine();
		
			if(answer.length() > 20 || answer.length() <= 0) {
				this.email = false;				
			}
			else {
				this.email = true;
			}
		
		
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMonthlyPrice() {
		return monthlyPrice;
	}
	public void setMonthlyPrice(boolean monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}
	public boolean isEmail() {
		return email;
	}
	public void setEmail(boolean email) {
		this.email = email;
	}
	
	
	

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCardSecurityCode() {
		return creditCardSecurityCode;
	}

	public void setCreditCardSecurityCode(String creditCardSecurityCode) {
		this.creditCardSecurityCode = creditCardSecurityCode;
	}

	@Override
	public boolean ageControl() {
		if(this.age < 18) {
			System.out.println("You are not old enought for register Gummy!!");
			return false;
		}
		else {
			System.out.println("You are old enought for register Gummy.");
			return true;			
		}
	}
	@Override
	public boolean monthlyPriceControl() {
		if(this.monthlyPrice == false) {
			System.out.println("You cannot register Gummy because your credit card number or your security code is invalid!!");
			return false;
		}
		else {
			System.out.println("Your credit card informations are valid , you can register Gummy.");
			return true;			
		}
					
	}
	@Override
	public boolean emailControl() {
		if(this.email == false) {
			System.out.println("You cannot register gummy because your email is invalid!!");
			return false;
		}
		else {
			System.out.println("Your email is valid , you can register Gummy.");
			return true;			
		}
	}
	
	
	
	
	
	
	
}
