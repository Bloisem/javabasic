package devonline;

public class FindMinString {
    public static void main(String[] args) {
        String[] numbers = new String[]{"one", "two", "three", "four", "five"};
        String minString = numbers[0];

        for(int i = 1; i < numbers.length; ++i) {
            minString = numbers[i].compareTo(minString) < 0 ? numbers[i] : minString;
        }

        System.out.println(minString);
    }
}
