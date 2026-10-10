// Print the next and previous character of a given character, and
// convert a lowercase letter to uppercase using ASCII arithmetic.

public class Q012_CharOperations {
    public static void main(String[] args) {

        char ch = 'p';
        System.out.println("Next Character = " + (char)(ch + 1));
        System.out.println("Previous Character = " + (char)(ch - 1));
        System.out.println("Uppercase = " + (char)(ch - 32));
    }
}

// Output
// Next Character = q
// Previous Character = o
// Uppercase = P