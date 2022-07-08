package devonline;

import java.util.Arrays;

public class PrintArrayElementsMoreThanAvg {
    public static void main(String[] args) {
        int[] array = new int[]{1, -100, 25,22,3,-10};
        int resultMiddle = findMiddle(array);
        int[] resultArray = findResult(resultMiddle, array);
        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] findResult(int resultMiddle, int[] array) {
        int[] resulArray = new int[array.length];
        int count = 0;
        int[] finalArray = array;
        int i = array.length;

        for(int var6 = 0; var6 < i; ++var6) {
            int j = finalArray[var6];
            if (j > resultMiddle) {
                resulArray[count] = j;
                ++count;
            }
        }

        finalArray = new int[count];

        for(i = 0; i < count; ++i) {
            finalArray[i] = resulArray[i];
        }

        return finalArray;
    }

    public static int findMiddle(int[] array) {
        int sum = 0;
        int[] var2 = array;
        int var3 = array.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int j = var2[var4];
            sum += j;
        }

        int round = (int)Math.round((double)sum / (double)array.length);
        return round;
    }
}
