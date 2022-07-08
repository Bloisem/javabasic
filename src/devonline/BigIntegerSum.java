package devonline;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerSum {
    public BigIntegerSum() {
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        String first = (new Scanner(System.in)).nextLine();
        System.out.println("Enter b number");
        String second = (new Scanner(System.in)).nextLine();
        boolean tempSum = false;
        StringBuilder builder = new StringBuilder();
        int zeroNumber;
        int strLenght;
        if (first.length() >= second.length()) {
            zeroNumber = first.length() - second.length();

            for(strLenght = 0; strLenght < zeroNumber; ++strLenght) {
                second = "0" + second;
            }
        } else {
            zeroNumber = second.length() - first.length();

            for(strLenght = 0; strLenght < zeroNumber; ++strLenght) {
                first = "0" + first;
            }
        }

        strLenght = first.length();

        for(int i = strLenght - 1; i >= 0; --i) {
            int result1 = Integer.parseInt(String.valueOf(first.charAt(i)));
            int result2 = Integer.parseInt(String.valueOf(second.charAt(i)));
            int result3 = result1 + result2;
            if (tempSum) {
                ++result3;
                tempSum = false;
            }

            if (result3 > 9) {
                builder.insert(0, result3 % 10);
                tempSum = true;
            } else {
                builder.insert(0, result3);
            }
        }

        if (tempSum) {
            builder.insert(0, 1);
        }


        System.out.println((new BigInteger(first)).add(new BigInteger(second)));
    }
}
