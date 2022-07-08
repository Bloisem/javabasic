package devonline;

import java.util.Arrays;

public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {
        int[] myArray = new int[]{0, 1};
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for(int i = 0; i < myArray.length; ++i) {
            if (min > myArray[i]) {
                min = myArray[i];
                minIndex = i;
            }

            if (max < myArray[i]) {
                max = myArray[i];
                maxIndex = i;
            }
        }

        myArray[maxIndex] = min;
        myArray[minIndex] = max;
        System.out.println(Arrays.toString(myArray));
    }
}
