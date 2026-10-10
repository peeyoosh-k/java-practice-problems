// Print the size in bits and bytes of byte, short, int, long, float, double, 
// and char using wrapper class constants.

public class Q010_DataTypeSizes {
    public static void main(String[] args) {
        
        System.out.println("byte size in bits = " + Byte.SIZE);
        System.out.println("byte size in bytes = " + Byte.BYTES);
        System.out.println();
        System.out.println("short size in bits = " + Short.SIZE);
        System.out.println("short size in bytes = " + Short.BYTES);
        System.out.println();
        System.out.println("int size in bits = " + Integer.SIZE);
        System.out.println("int size in bytes = " + Integer.BYTES);
        System.out.println();
        System.out.println("long size in bits = " + Long.SIZE);
        System.out.println("long size in bytes = " + Long.BYTES);
        System.out.println();
        System.out.println("float size in bits = " + Float.SIZE);
        System.out.println("float size in bytes = " + Float.BYTES);
        System.out.println();
        System.out.println("double size in bits = " + Double.SIZE);
        System.out.println("double size in bytes = " + Double.BYTES);
        System.out.println();
        System.out.println("char size in bits = " + Character.SIZE);
        System.out.println("char size in bytes = " + Character.BYTES);
    }
}

// Output 
// byte size in bits = 8
// byte size in bytes = 1
//
// short size in bits = 16
// short size in bytes = 2
//
// int size in bits = 32
// int size in bytes = 4
//
// long size in bits = 64
// long size in bytes = 8
//
// float size in bits = 32
// float size in bytes = 4
//
// double size in bits = 64
// double size in bytes = 8
//
// char size in bits = 16
// char size in bytes = 2