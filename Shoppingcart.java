import java.util.ArrayList;

public class Shoppingcart {

    ArrayList<CartItem> items = new ArrayList<>();

    // ADD PRODUCT
    void addProduct(Product product, int quantity) {

        CartItem item = new CartItem(product, quantity);

        items.add(item);

        System.out.println(product.name + " added to cart.");
    }

    // DISPLAY CART
    void displayCart() {

        System.out.println("\n---- CART ITEMS ----");

        for (CartItem item : items) {

            System.out.println(
                item.product.name +
                " x " +
                item.quantity +
                " = ₹" +
                item.getTotalPrice()
            );
        }
    }

    // CALCULATE TOTAL
    double calculateTotal() {

        double total = 0;

        for (CartItem item : items) {

            total += item.getTotalPrice();
        }

        return total;
    }
}
