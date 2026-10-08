// Print the results of 
// 10 + 20 + "Java" + 10 + 20 and "Java" + 10 + 20 + 10 + 20, 
// and explain the difference in comments.

public class Q008_ConcatenationDemo {
    public static void main(String[] args) {
        
        // The first two numbers are added before String concatenation begins.
        System.out.println(10 + 20 + "Java" + 10 + 20);

        // Because the expression starts with a String,
        // every following number is concatenated as text.
        System.out.println("Java" + 10 + 20 + 10 + 20);
    }
}

// Output 
// 30Java1020
// Java10201020