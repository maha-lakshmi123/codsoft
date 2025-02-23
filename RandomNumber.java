import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String choice;
        int roundsWon = 0, totalAttempts = 0;

        do {
            int ran_int = random.nextInt(100) + 1;
            int attempts = 0;
            int correctguess = 0;

            System.out.println("New Round!");
            while (attempts < 3) {
                attempts++; 
                System.out.println("Attempt - " + attempts);
                System.out.println("Guess the number between 1 to 100:");
                int guess_num = sc.nextInt();
                sc.nextLine(); 
                if (guess_num == ran_int) {
                    System.out.println("Correct! You won this round.");
                    roundsWon++;
                    correctguess = 1;
                    break; 
                } else if (guess_num < ran_int) {
                    System.out.println("Too small");
                } else {
                    System.out.println("Too high");
                }
		  totalAttempts++;
            }

            if (correctguess==0) {
                System.out.println("Attempts Finished! The correct number was: " + ran_int);
            }

            System.out.println("Do you want to play again? (yes/no):");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Game Over!");
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Total attempts: " + totalAttempts);
        System.out.println("Thanks for playing!");

        sc.close();
    }
}
