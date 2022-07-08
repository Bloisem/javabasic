package devonline;

public class SumFrom1To100 {
    public static void main(String[] args) {
        int from = 0;
        int to = 100;
        int sum = 0;

        for(int i = from; i <= to; ++i) {
            sum += i;
        }

        System.out.println(sum);
    }
}
