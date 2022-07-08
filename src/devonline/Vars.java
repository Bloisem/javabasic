package devonline;

import java.util.Scanner;

public class Vars {
    public static void main(String[] args) {
        double i = 1.236;
        System.out.println(i);
        double a = (new Scanner(System.in)).nextDouble();
        System.out.println(a);
        String n = (new Scanner(System.in)).nextLine();
        System.out.println(n);
        char cf = (new Scanner(System.in)).nextLine().charAt(0);
        System.out.println(cf);
        boolean bil = (new Scanner(System.in)).nextBoolean();
        System.out.println(bil);
    }
}
