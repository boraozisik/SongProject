package GummyDownload;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your PC's empty space:");
		int emptySpace = input.nextInt();
		System.out.println("Enter your PC's RAM:");
		int ram = input.nextInt();
		System.out.println("Enter your PC's graphic card:");
		int graphicCard = input.nextInt();
		
		try {
			requirementControl(emptySpace, ram, graphicCard);
		}
		catch (RequirementsUnsatisfiedException e) {
			e.printStackTrace();
		}

	}
public static void requirementControl(int emptySpace,int ram,int graphicCard) {
	if(emptySpace > 49 && ram > 7 && graphicCard > 1049) {
		System.out.println("Gummy is downloading....");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Gummy downloaded!");
	}
	else {
		throw new RequirementsUnsatisfiedException("Reguirements Unsatisfied!!!!");
	}
	
}
}
