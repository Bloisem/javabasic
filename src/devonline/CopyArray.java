package devonline;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 5};
        int[] copyArray = new int[5];
        System.arraycopy(myArray, 0, copyArray, 0, myArray.length);
        System.out.println(Arrays.toString(copyArray));
    }
}
