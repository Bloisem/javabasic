package devonline;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int number = (new Random()).nextInt(10);
        System.out.println("Please enter your number");
        int userNumber = (new Scanner(System.in)).nextInt();
        boolean result = false;
        if (userNumber == number) {
            result = true;
        }

        System.out.println(result ? "Congratulations, you guessed the number!" : "Sorry, but your number is invalid! Try again later...");
    }
}
