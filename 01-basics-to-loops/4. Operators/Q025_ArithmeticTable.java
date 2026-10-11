// Read two numbers and print the results of all 
// arithmetic operations in a formatted layout.

import java.util.Scanner;

public class Q025_ArithmeticTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Number = ");
        double x = sc.nextDouble();

        System.out.print("Second Number = ");
        double y = sc.nextDouble();

        System.out.println("-------------------------");
        System.out.printf("%-20s %.2f%n","Addition = ", x + y);
        System.out.printf("%-20s %.2f%n" ,"Subtraction = ", x - y);
        System.out.printf("%-20s %.2f%n","Multiplication = ", x * y);
        System.out.printf("%-20s %.2f%n","Division = ", x / y);
        System.out.printf("%-20s %.2f%n","Remainder = ", x % y);

        sc.close();
    }
}

// Output
// First Number = 12
// Second Number = 3
// -------------------------
// Addition =           15.00
// Subtraction =        9.00
// Multiplication =     36.00
// Division =           4.00
// Remainder =          0.00