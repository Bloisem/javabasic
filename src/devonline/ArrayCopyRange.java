package devonline;

import java.util.Arrays;
import java.util.Scanner;


    public class ArrayCopyRange {
        public ArrayCopyRange() {
        }

        public static void main(String[] args) {
            int[] startArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
            System.out.println("Enter first number");
            int starIndex = (new Scanner(System.in)).nextInt();
            System.out.println("Enter second number");
            int endIndex = (new Scanner(System.in)).nextInt();
            int[] myArray = new int[endIndex - starIndex];

            for(int i = 0; starIndex != endIndex; ++starIndex) {
                myArray[i] = startArray[starIndex];
                ++i;
            }

            System.out.println(Arrays.toString(myArray));
        }
    }


