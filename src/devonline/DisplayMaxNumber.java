package devonline;

import java.util.Scanner;

public class DisplayMaxNumber {
    public static void main(String[] args) {
        int a = (new Scanner(System.in)).nextInt();
        int b = (new Scanner(System.in)).nextInt();
        int result = a < b ? b : a;
        System.out.println("Maximum number " + result);
    }
}
