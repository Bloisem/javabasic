package devonline;

public class SumLibrary {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;
        System.out.println(Sum(a, b));
    }

    private static short Sum(short a, short b) {
        int sum = a + b;
        return (short)sum;
    }

    private static int Sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    private static long Sum(long a, long b) {
        long sum = a + b;
        return sum;
    }

    private static float Sum(float a, float b) {
        float sum = a + b;
        return sum;
    }

    private static double Sum(double a, double b) {
        double sum = a + b;
        return sum;
    }
}
