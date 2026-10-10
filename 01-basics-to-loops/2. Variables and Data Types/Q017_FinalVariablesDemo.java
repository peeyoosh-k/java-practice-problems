// Declare the GST rate as a final constant and use it to calculate
// the tax on a given price.

public class Q017_FinalVariablesDemo {
    public static void main(String[] args) {

        final double GST_RATE = 0.18;
        double price = 1000;

        double gstAmount = price * GST_RATE;
        double totalPrice = price + gstAmount;

        System.out.println("Tax = " + gstAmount);
        System.out.println("Total Price = " + totalPrice);
    }
}

// Output
// Tax = 180.0
// Total Price = 1180.0