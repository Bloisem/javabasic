package devonline;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter number");
        int number = (new Scanner(System.in)).nextInt();
        int result = 1;
        if (number < 0) {
            System.out.println("Value should be >=0");
        } else {
            for(int i = 1; i <= number; ++i) {
                int oldResult = result;
                result *= i;
                if (result / i != oldResult) {
                    System.out.println("Int overflow");
                    break;
                }
            }

            System.out.println(result);
        }

    }
}
