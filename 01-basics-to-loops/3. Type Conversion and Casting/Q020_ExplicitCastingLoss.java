// Cast 300 to byte, 9.99 to int, and -9.99 to int,
// and print the results.

public class Q020_ExplicitCastingLoss {
    public static void main(String[] args) {

        System.out.println("300 to byte = " + (byte)(300));
        System.out.println("9.99 to int = " + (int)(9.99));
        System.out.println("-9.99 to int = " + (int)(-9.99));
    }
}

// Output
// 300 to byte = 44
// 9.99 to int = 9
// -9.99 to int = -9