package devonline;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        System.out.println("Enter number");
        int number = (new Scanner(System.in)).nextInt();
        int len = String.valueOf(number).length();

        for(int i = 0; i < len; ++i) {
            System.out.print(number % 10);
            number /= 10;
        }

    }
}
