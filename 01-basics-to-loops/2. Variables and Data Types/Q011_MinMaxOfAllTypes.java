// Print the minimum and maximum values of
// byte, short, int, long, float, and double.

public class Q011_MinMaxOfAllTypes {
    public static void main(String[] args) {
        
        System.out.println("Minimum Value of byte = " + Byte.MIN_VALUE);
        System.out.println("Maximum Value of byte = " + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("Minimum Value of short = " + Short.MIN_VALUE);
        System.out.println("Maximum Value of short = " + Short.MAX_VALUE);
        System.out.println();
        System.out.println("Minimum Value of int = " + Integer.MIN_VALUE);
        System.out.println("Maximum Value of int = " + Integer.MAX_VALUE);
        System.out.println();
        System.out.println("Minimum Value of long = " + Long.MIN_VALUE);
        System.out.println("Maximum Value of long = " + Long.MAX_VALUE);
        System.out.println();
        System.out.println("Minimum Value of float = " + -Float.MAX_VALUE);
        System.out.println("Maximum Value of float = " + Float.MAX_VALUE);
        System.out.println();
        System.out.println("Minimum Value of double = " + -Double.MAX_VALUE);
        System.out.println("Maximum Value of double = " + Double.MAX_VALUE);
    }
}

// Output
// Minimum Value of byte = -128
// Maximum Value of byte = 127
//
// Minimum Value of short = -32768
// Maximum Value of short = 32767
//
// Minimum Value of int = -2147483648
// Maximum Value of int = 2147483647
//
// Minimum Value of long = -9223372036854775808
// Maximum Value of long = 9223372036854775807
//
// Minimum Value of float = -3.4028235E38
// Maximum Value of float = 3.4028235E38
//
// Minimum Value of double = -1.7976931348623157E308
// Maximum Value of double = 1.7976931348623157E308