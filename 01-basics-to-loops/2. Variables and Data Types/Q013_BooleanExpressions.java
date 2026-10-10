// Store the results of five different comparisons in 
// boolean variables and print them.

public class Q013_BooleanExpressions {
    public static void main(String[] args) {

        boolean equalTo = 10 == 10;
        boolean notEqual = 10 != 12;
        boolean greaterThan = 8 > 9;
        boolean lessThan = 2 < 3;
        boolean greaterThanOrEqualTo = 4 >= 4;

        System.out.println("Equal to = " + equalTo);
        System.out.println("Not equal to = " + notEqual);
        System.out.println("Greater than = " + greaterThan);
        System.out.println("Less than = " + lessThan);
        System.out.println("Greater than or equal to = " + greaterThanOrEqualTo);
    }
}

// Output
// Equal to = true
// Not equal to = true
// Greater than = false
// Less than = true
// Greater than or equal to = true