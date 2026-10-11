// Convert the character '7' to the integer 7
// and the integer 7 to the character '7'.

public class Q021_CharIntConversion {
    public static void main(String[] args) {

        char ch = '7';
        int num = ch - '0';

        System.out.println("Integer = " + num);

        System.out.println("Character = " + (char)(num + '0'));
    }
}

// Output
// Integer = 7
// Character = 7