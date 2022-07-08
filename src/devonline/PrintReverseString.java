package devonline;

public class PrintReverseString {
    public static void main(String[] args) {
        String myString = "Hello world";
        String finalString = "";

        for(int i = myString.length() - 1; i >= 0; --i) {
            finalString = finalString + myString.charAt(i);
        }

        System.out.println(finalString);
    }
}
