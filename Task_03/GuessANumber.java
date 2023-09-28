import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        try {
            // Convert the input to an integer
            int guess = Integer.parseInt(input);

            if (guess == rnd_number) {
                System.out.println("You have guessed correctly!");
            } else if (guess > rnd_number) {
                System.out.println("The number is a bit too high... Guess again!");
                makeAGuess();
            } else {
                System.out.println("The number is a bit too low... Guess again!");
                makeAGuess(); 
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            makeAGuess(); 
        }
    }
}






   
