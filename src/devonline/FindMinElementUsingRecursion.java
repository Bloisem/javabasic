package devonline;

public class FindMinElementUsingRecursion {
    public static void main(String[] args) {
        int[] myArray = new int[]{-100, 2, 3, 4, 5, -6, 0, -10, -1000};
        System.out.println(minElementRecursion(myArray.length - 1, myArray[myArray.length - 1], myArray));
    }

    private static int minElementRecursion(int i, int min, int[] array) {
        if (i < 0) {
            return min;
        } else if (min > array[i]) {
            min = array[i];
            --i;
            return minElementRecursion(i, min, array);
        } else {
            --i;
            return minElementRecursion(i, min, array);
        }
    }
}
