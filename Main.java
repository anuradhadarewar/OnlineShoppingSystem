import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Login System
        Login login = new Login("admin", "1234");

        System.out.println("===== LOGIN SYSTEM =====");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (login.authenticate(user, pass)) {

            System.out.println("\nLogin Successful!");

        } else {

            System.out.println("\nInvalid Username or Password!");
            return;
        }

        // Products
        Product p1 = new Product(1, "Laptop", 50000, 5);
        Product p2 = new Product(2, "Mouse", 500, 10);
        Product p3 = new Product(3, "Keyboard", 1500, 8);

        // Customer
        Customer customer = new Customer(101, "Anuradha");

        System.out.println("\n===== ONLINE SHOPPING SYSTEM =====");
        System.out.println("Customer : " + customer.getCustomerName());

        // Cart
        Cart cart = new Cart();

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        // Remove Product
        cart.removeProduct(2);

        // Search Product
        cart.searchProduct("Laptop");

        // Display Cart
        cart.displayCart();

        // Apply Coupon
        cart.applyCoupon("SAVE10");

        // Payment System
        Payment payment = new Payment();
        payment.makePayment("UPI");

        sc.close();
    }
}