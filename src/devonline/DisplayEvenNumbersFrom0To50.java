package devonline;

public class DisplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {
        int from = 0;
        int to = 50;
        String a = "odd";

        for(int i = from; i <= to; ++i) {
            if (a == "even" && i % 2 == 0) {
                System.out.print("" + i + " ");
            }

            if (a == "odd" && i % 2 != 0) {
                System.out.print("" + i + " ");
            }
        }

    }
}
