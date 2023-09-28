import java.util.Scanner;

public class Task02{

	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
			System.out.println("Please type your name.");

			String input = scanner.nextLine();

			System.out.println("Hello, " + input + " please type your age.");

			int age = Integer.parseInt(scanner.nextLine());

			int retirementAge = 67;

			int total = retirementAge - age;

			System.out.println("You will retire in " + total + " years"); 
	}
}