package devonline;

public class SumRecursion {
    public static void main(String[] args) {
        int a = 100;
        int suma = 0;
        System.out.println(sum(a, suma));
    }

    private static int sum(int a, int suma) {
        if (a == 0) {
            return suma;
        } else {
            suma += a;
            return sum(a - 1, suma);
        }
    }
}
