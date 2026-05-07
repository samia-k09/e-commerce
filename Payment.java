import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // PRODUCTS
        Product laptop =
            new Product(1, "Laptop", 70000, 5);

        Product mouse =
            new Product(2, "Mouse", 1000, 20);

        // CART
        Shoppingcart cart = new Shoppingcart();

        cart.addProduct(laptop, 1);
        cart.addProduct(mouse, 2);

        cart.displayCart();


        // PAYMENT METHOD
        int  ch;
        double amount;
		amount= cart.calculateTotal();
		Creditcard credit = new Creditcard();
		Paypal pay=new Paypal();
		Crypto crypt =new Crypto();
		Scanner sc=new Scanner(System.in);
			System.out.println("=======Payment Option======");
			System.out.println("Enter 1 for Credit Card");
			System.out.println("Enter 2 for Paypal");
			System.out.println("Enter 3 for Crypto ");
			System.out.println("Enter 4 for Cash on Delivery");
			System.out.println("Enter 5 for Back");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1 : credit.paymentprocess(amount);
			        break;
			case 2: pay.paymentprocess(amount);
			        break;
			case 3: crypt.paymentprocess(amount);
			        break;
			case 4: System.out.println("Cash on delivery confirmed");
			        break;
			case 5: break;
			default: System.out.println("Invalid choice");
			}
    }
	}
