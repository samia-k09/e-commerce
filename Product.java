public class Product {

  
    int id;
    String name;
    double price;
    int stock;

   
    Product(int id, String name, double price, int stock) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    
    void displayProduct() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Stock: " + stock);
    }
}
