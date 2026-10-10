// Demonstrate implicit conversion through the
// chain byte, short, int, long, float, double.

public class Q019_ImplicitConversionChain {
    public static void main(String[] args) {

        byte a = 10;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        System.out.println("byte = " + a);
        System.out.println("short = " + b);
        System.out.println("int = " + c);
        System.out.println("long = " + d);
        System.out.println("float = " + e);
        System.out.println("double = " + f);
    }
}

// Output
// byte = 10
// short = 10
// int = 10
// long = 10
// float = 10.0
// double = 10.0