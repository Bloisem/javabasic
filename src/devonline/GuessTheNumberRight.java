package devonline;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberRight {
    public static void main(String[] args) {
        int number = (new Random()).nextInt(10);
        boolean result = false;

        while(true) {
            while(true) {
                System.out.println("Please enter a number");
                int userNumber = (new Scanner(System.in)).nextInt();
                if (number == userNumber) {
                    System.out.println("Congratulations, you guessed the number!");
                    return;
                }

                if (number < userNumber) {
                    System.out.println("number < " + userNumber + ". Try again:");
                } else if (number > userNumber) {
                    System.out.println("number > " + userNumber + ". Try again:");
                } else if (userNumber < 0 || userNumber > 10) {
                    System.out.println("Enter correct number from 1 to 10");
                }
            }
        }
    }
}
