package devonline;

public class ArrayElementCount {
    public ArrayElementCount() {
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2};
        int countNumber = 2;
        int result = 0;

        for(int i = 0; i < myArray.length; ++i) {
            int var10000;
            if (myArray[i] == countNumber) {
                ++result;
                var10000 = result;
            } else {
                var10000 = result;
            }

            result = var10000;
        }

        System.out.println(result);
    }
}
