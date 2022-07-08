package devonline;

public class CheckIfAllNumbersArePositive {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 5, 5, 7, -8};
        String result = "All positive";

        for(int i = 0; i < myArray.length; ++i) {
            if (myArray[i] < 0) {
                result = "Not all positive";
                break;
            }
        }

        System.out.println(result);
    }
}
