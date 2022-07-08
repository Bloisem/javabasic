package devonline;

public class FizzBuzz {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;

        for(int i = a; i <= b; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
