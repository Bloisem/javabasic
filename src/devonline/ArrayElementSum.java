package devonline;

public class ArrayElementSum {
    public ArrayElementSum() {
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3};
        int sum = 0;

        for(int i = 0; i < myArray.length; ++i) {
            sum += myArray[i];
        }

        System.out.println(sum);
    }
}
