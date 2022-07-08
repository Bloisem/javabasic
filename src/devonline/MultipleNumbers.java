package devonline;

import java.util.Scanner;

public class MultipleNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a");
        int a = (new Scanner(System.in)).nextInt();
        System.out.println("Enter b");
        int b = (new Scanner(System.in)).nextInt();
        int result = getMultipleResult(a, b);
        System.out.println(result);
    }

    private static int getMultipleResult(int a, int b) {
        int result = a * b;
        return result;
    }
}
