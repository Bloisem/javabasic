package devonline;

import java.util.Arrays;

public class ArrayReverse {
    public ArrayReverse() {
    }

    public static void main(String[] args) {
        int[] startArray = new int[]{1, 2, 3, 4, 5};
        int[] finishArray = new int[startArray.length];
        finishArray[0] = startArray[startArray.length - 1];

        for(int i = 1; i < startArray.length; ++i) {
            finishArray[i] = startArray[i - 1];
        }

        System.out.println(Arrays.toString(finishArray));
    }
}
