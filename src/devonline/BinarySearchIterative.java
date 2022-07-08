package devonline;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int number = 100;
        int[] myArray = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200};
        System.out.println(findElement(number, myArray));
    }

    private static int findElement(int number, int[] myArray) {
        int startIndex = 0;
        int endIndex = myArray.length - 1;
        return myMethod(number, myArray, startIndex, endIndex);
    }

    private static int myMethod(int number, int[] myArray, int startIndex, int endIndex) {
        while(true) {
            if (startIndex <= endIndex) {
                int middleIndex = startIndex / 2 + endIndex / 2;
                int middleValue = myArray[middleIndex];
                if (middleValue < number) {
                    startIndex = middleIndex + 1;
                    continue;
                }

                if (middleValue > number) {
                    endIndex = middleIndex - 1;
                    continue;
                }

                return middleIndex;
            }

            return -1;
        }
    }
}
