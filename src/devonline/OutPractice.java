package devonline;

public class OutPractice {
    public static void main(String[] args) {
        int i;
        for(i = 0; i < 10; ++i) {
            if (i % 3 == 0) {
                System.out.print(i);
            }
        }

        System.out.println();

        for(i = 0; i < 10; ++i) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

    }
}
