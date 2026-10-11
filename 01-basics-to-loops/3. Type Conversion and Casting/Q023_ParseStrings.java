// Convert the strings "100", "3.14", and
//  "true" to int, double, and boolean values.

public class Q023_ParseStrings {
    public static void main(String[] args) {

        String str1 = "100";
        String str2 = "3.14";
        String str3 = "true";

        int num = Integer.parseInt(str1);
        double decimal = Double.parseDouble(str2);
        boolean flag = Boolean.parseBoolean(str3);

        System.out.println(num);
        System.out.println(decimal);
        System.out.println(flag);
    }
}

// Output
// 100
// 3.14
// true