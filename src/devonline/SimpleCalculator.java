package devonline;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Write first number");
        int a = (new Scanner(System.in)).nextInt();
        System.out.println("Write second number");
        int b = (new Scanner(System.in)).nextInt();
        int sum = a + b;
        System.out.println("result " + a + "+" + b + "=" + sum);
        int less = a - b;
        System.out.println("result " + a + "-" + b + "=" + less);
        int multiple = a * b;
        System.out.println("result " + a + "*" + b + "=" + multiple);
        int divided = a / b;
        System.out.println("result " + a + "/" + b + "=" + divided);
        int percent = a % b;
        System.out.println("result " + a + "%" + b + "=" + percent);
    }
}
