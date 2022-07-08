package devonline;

public class SumFunctionWithVarArgs {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(SumMassive(myArray));
    }

    private static int SumMassive(int... args) {
        int sum = 0;
        int[] var2 = args;
        int var3 = args.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int arg = var2[var4];
            sum += arg;
        }

        return sum;
    }
}
