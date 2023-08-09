import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        // Generate a random number.
        int randomNumber = (int) (Math.random() * 100) + 1;
        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter their guess.
        System.out.println("Guess a number between 1 and 100.");
        int guess = scanner.nextInt();
        // Compare the user's guess with the generated number.
        while (guess != randomNumber) {
            if (guess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }
            // Prompt the user to enter their guess again.
            System.out.println("Guess again.");
            guess = scanner.nextInt();
        }
        // The user guessed the correct number!
        System.out.println("You guessed the correct number!");
    }
}