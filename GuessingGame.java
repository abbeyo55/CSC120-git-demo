import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Let's play a game!");
        int min = 0;
        int max = 10;
        int secretNumber = 5;
        int guess = -1;
        Scanner userInput = new Scanner(System.in);

        System.out.print("I'm thinking of a number between ");
        System.out.print(min);
        System.out.print(" and ");
        System.out.println(max);
        
        while(guess != secretNumber) {
            System.out.println("Guess an integer: ");
            guess = userInput.nextInt();
            if (guess != secretNumber);
                System.out.println("Guess again...");

        }
        System.out.println("Good Job, you guessed it!");
        userInput.close();
    }




}