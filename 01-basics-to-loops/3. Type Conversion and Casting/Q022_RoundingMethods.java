// Apply Math.round, Math.ceil, Math.floor, and Math.rint
//  to the values 4.5, -4.5, and 4.4 and print the results.

public class Q022_RoundingMethods {
    public static void main(String[] args) {

        System.out.println(Math.round(4.5));
        System.out.println(Math.ceil(4.5));
        System.out.println(Math.floor(4.5));
        System.out.println(Math.rint(4.5));
        System.out.println();
        System.out.println(Math.round(-4.5));
        System.out.println(Math.ceil(-4.5));
        System.out.println(Math.floor(-4.5));
        System.out.println(Math.rint(-4.5));
        System.out.println();
        System.out.println(Math.round(4.4));
        System.out.println(Math.ceil(4.4));
        System.out.println(Math.floor(4.4));
        System.out.println(Math.rint(4.4));
    }
}

// Output
// 5
// 5.0
// 4.0
// 4.0
//
// -4
// -4.0
// -5.0
// -4.0
//
// 4
// 5.0
// 4.0
// 4.0