// Use printf to print a neatly aligned table of three students 
// with their names and marks.

public class Q005_StudentMarksTable {
    public static void main(String[] args) {
        
        System.out.printf("%-10s %5s %n", "Name","Marks");
        System.out.printf("%-10s %5d %n", "Anil", 100);
        System.out.printf("%-10s %5d %n", "Mukesh", 0);
        System.out.printf("%-10s %5d %n", "Sunil",45 );
    }
}

// Output 
// Name       Marks 
// Anil         100 
// Mukesh         0 
// Sunil         45