package devonline;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        System.out.println("Please, enter number's week day");
        int numberDay = (new Scanner(System.in)).nextInt();
        String Day = "";
        if (numberDay == 1) {
            Day = "Monday";
        } else if (numberDay == 2) {
            Day = "Tuesday";
        } else if (numberDay == 3) {
            Day = "Wednersday";
        } else if (numberDay == 4) {
            Day = "Thursday";
        } else if (numberDay == 5) {
            Day = "Friday";
        } else if (numberDay == 6) {
            Day = "Saturday";
        } else if (numberDay == 7) {
            Day = "Sunday";
        }

        if (numberDay >= 1 && numberDay <= 7) {
            System.out.println("Today is " + Day);
        } else {
            System.out.println("Error, please enter number from 1 to 7");
        }

    }
}
