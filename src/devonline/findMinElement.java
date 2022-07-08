package devonline;

public class findMinElement {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, -4, 5, -6};
        int min = myArray[0];

        for(int i = 0; i < myArray.length; ++i) {
            min = myArray[i] <= min ? myArray[i] : min;
        }

        System.out.println(min);
    }
}
