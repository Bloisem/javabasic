package devonline;

public class FactorialRecursion {
    public static void main(String[] args) {
        int b = 6;
        System.out.println(factorialTo(1, b));
    }

    private static int factorialTo(int factorial, int b) {
        return b == 1 ? factorial : factorialTo(factorial * b, b - 1);
    }
}
