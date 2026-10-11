// Evaluate and print the values of expressions combining pre-increment
// and post-increment on the same variable.

public class Q028_PrePostIncrementPuzzle {
    public static void main(String[] args) {

        int a = 5;
        int result1 = a++ + ++a;
        System.out.println("a++ + ++a: result = " + result1 + ", a = " + a);

        int b = 5;
        int result2 = ++b + b++;
        System.out.println("++b + b++: result = " + result2 + ", b = " + b);

        int c = 5;
        int result3 = c++ + c++;
        System.out.println("c++ + c++: result = " + result3 + ", c = " + c);
    }
}

// Output
// a++ + ++a: result = 12, a = 7
// ++b + b++: result = 12, b = 7
// c++ + c++: result = 11, c = 7