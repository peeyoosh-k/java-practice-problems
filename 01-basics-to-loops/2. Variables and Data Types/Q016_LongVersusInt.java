// Calculate 20! using int and long, and show the difference in output.

public class Q016_LongVersusInt {
    public static void main(String[] args) {

        int a = 20;
        long b = 20;
        int f1 = 1;
        long f2 = 1;

        for(int i = 1; i<=a; i++) {
            f1 = f1 * i;
        }
        for(int i = 1; i<=b; i++) {
            f2 = f2 * i;
        }

        System.out.println("Integer Value = " + f1);
        System.out.println("Long Value = " + f2);
    }
}

// Output
// Integer Value = -2102132736
// Long Value = 2432902008176640000