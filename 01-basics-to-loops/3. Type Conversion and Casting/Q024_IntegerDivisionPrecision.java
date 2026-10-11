// Compute the average of two integers correctly as a decimal value and 
// show how incorrect typing gives a wrong result.

public class Q024_IntegerDivisionPrecision {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        double wrong = (a + b) / 2;

        double correct = (double)(a + b) / 2;

        System.out.println("Wrong = " + wrong);
        System.out.println("Correct = " + correct);
    }
}

// Output
// Wrong = 3.0
// Correct = 3.5
