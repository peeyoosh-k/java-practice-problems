// Swap two numbers using the XOR operator.

import java.util.Scanner;

public class Q027_SwapUsingXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("First Number = ");
        int a = sc.nextInt();

        System.out.print("Second Number = ");
        int b = sc.nextInt();

        System.out.println("Before Swap");
        System.out.println(a);
        System.out.println(b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap");
        System.out.println(a);
        System.out.println(b);

        sc.close(); 

    }
}

// Output 
// First Number = 45
// Second Number = 76
// Before Swap
// 45
// 76
// After Swap
// 76
// 45