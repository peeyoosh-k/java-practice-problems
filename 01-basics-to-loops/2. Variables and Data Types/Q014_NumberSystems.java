// Print the number 25 in binary, octal,
// and hexadecimal using Integer class methods.

public class Q014_NumberSystems {
    public static void main(String[] args) {
        
        System.out.println("Binary = " + Integer.toBinaryString(25));
        System.out.println("Octal = " + Integer.toOctalString(25));
        System.out.println("Hexadecimal = " + Integer.toHexString(25));
    }
}

// Output 
// Binary = 11001
// Octal = 31
// Hexadecimal = 19