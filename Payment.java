public class Payment {

    public void makePayment(String method) {

        System.out.println("\n===== PAYMENT =====");

        if(method.equalsIgnoreCase("UPI")) {

            System.out.println("Payment done using UPI.");

        } else if(method.equalsIgnoreCase("CARD")) {

            System.out.println("Payment done using Card.");

        } else if(method.equalsIgnoreCase("CASH")) {

            System.out.println("Cash on Delivery Selected.");

        } else {

            System.out.println("Invalid Payment Method.");
        }
    }
}