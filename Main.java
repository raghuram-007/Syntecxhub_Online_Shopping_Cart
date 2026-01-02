import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n===== Online Shopping Cart =====");
            System.out.println("1. Add Item");
            System.out.println("2. View Cart");
            System.out.println("3. Calculate Total");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    cart.addItem(name, price, qty);
                    break;

                case 2:
                    cart.viewCart();
                    break;

                case 3:
                    cart.calculateTotal();
                    break;

                case 4:
                    System.out.println(" Thank you for shopping!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println(" Invalid choice!");
            }
        }
    }
}
