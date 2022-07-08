package devonline;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArray = new int[]{100, -11, 7, 9, 4, 8, 4, 6, -6, -8, 0, -10, 100, -11, 7, 9, 4, 8, 4, 6, -6, -8, 0, -10};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private static int[] sort(int[] myArray) {
        int min = myArray[0];

        for(int i = 0; i < myArray.length; ++i) {
            for(int j = 0; j < myArray.length - 1 - i; ++j) {
                if (myArray[j] > myArray[j + 1]) {
                    min = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = min;
                }
            }
        }

        return myArray;
    }
}
