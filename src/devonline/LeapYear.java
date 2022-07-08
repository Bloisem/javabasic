package devonline;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Please enter year");
        int year = (new Scanner(System.in)).nextInt();
        boolean result = false;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            result = true;
        }

        if (result) {
            System.out.println("Year leap");
        } else {
            System.out.println("Year not leap");
        }

    }
}
