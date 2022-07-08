package devonline;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 0, 9, 7, 8, 6};
        int query = 6;
        System.out.println(searchRecursion(0, -1, query, array));
    }

    private static int searchRecursion(int i, int index, int query, int[] array) {
        if (i == array.length) {
            return index;
        } else {
            return array[i] == query ? i : searchRecursion(i + 1, index, query, array);
        }
    }
}
