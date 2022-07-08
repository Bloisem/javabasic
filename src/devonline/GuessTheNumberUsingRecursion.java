package devonline;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Enter number from 1 to 10");
        int number = (new Random()).nextInt(10);
        GuessNumberRecurtion(number);
    }

    private static void GuessNumberRecurtion(int number) {
        int a = (new Scanner(System.in)).nextInt();
        if (a == number) {
            System.out.println("Congratulation!");
        } else if (a < number) {
            System.out.println("Your number so small");
            GuessNumberRecurtion(number);
        } else if (a > number) {
            System.out.println("Your number so big");
            GuessNumberRecurtion(number);
        } else {
            System.out.println("Enter number from 1 to 10");
        }

    }

}
