package devonline;

public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        int to = 9;

        for(int i = 1; i <= to; ++i) {
            for(int j = 1; j <= to; ++j) {
                if (i == 1 && j == 1) {
                    System.out.print(" \t");
                } else {
                    System.out.print(i * j + "\t");
                }
            }

            System.out.println();
        }

    }
}
