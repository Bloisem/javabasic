package devonline;

public class Tome {
    public static void main(String[] args) {
        long time = System.nanoTime();

        for(int i = 0; i < 1000000; ++i) {
            System.currentTimeMillis();
        }

        long result = System.nanoTime() - time;
        System.out.println((double)result / 1.0E9 + " second");
    }
}
