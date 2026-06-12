import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> products = new ArrayList<>();

    // Add Product
    public void addProduct(Product product) {

        if (product.getStock() > 0) {

            products.add(product);
            product.reduceStock();

            System.out.println(product.getName() + " added to cart.");

        } else {

            System.out.println(product.getName() + " is Out Of Stock.");
        }
    }

    // Remove Product
    public void removeProduct(int productId) {

        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).getId() == productId) {

                System.out.println(products.get(i).getName()
                        + " removed from cart.");

                products.remove(i);
                return;
            }
        }

        System.out.println("Product not found.");
    }

    // Search Product
    public void searchProduct(String productName) {

        System.out.println("\n===== SEARCH PRODUCT =====");

        for (Product p : products) {

            if (p.getName().equalsIgnoreCase(productName)) {

                System.out.println("Product Found:");
                System.out.println(p);
                return;
            }
        }

        System.out.println("Product not found.");
    }

    // Display Cart
    public void displayCart() {

        System.out.println("\n===== CART ITEMS =====");

        double total = 0;

        for (Product p : products) {

            System.out.println(p);
            total += p.getPrice();
        }

        System.out.println("----------------------");
        System.out.println("Total Amount = Rs." + total);
    }

    // Apply Coupon
    public void applyCoupon(String couponCode) {

        double total = 0;

        for (Product p : products) {
            total += p.getPrice();
        }

        if (couponCode.equalsIgnoreCase("SAVE10")) {

            double discount = total * 0.10;
            total = total - discount;

            System.out.println("\n===== COUPON APPLIED =====");
            System.out.println("Coupon Code : SAVE10");
            System.out.println("Discount : Rs." + discount);
            System.out.println("Final Amount : Rs." + total);

        } else {

            System.out.println("Invalid Coupon Code");
        }
    }
}