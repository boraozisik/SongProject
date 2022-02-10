package GummyDownload;

public class RequirementsUnsatisfiedException extends ArithmeticException{

	public RequirementsUnsatisfiedException(String message) {
		super(message);
	}
	@Override
	public void printStackTrace() {
		System.out.println("That's a requirement unsatisfied error!!!!");
	}

}
