package OOPsPP2;
import java.util.Scanner;

public class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Product class");
        int n = sc.nextInt();

        // Array of Product objects
        Product[] products = new Product[n];

        // Array to store GET results
        int[] results = new int[n];

        int productCount = 0;
        int resultCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the operation: ");
            String operation = sc.next();

            // ADD operation
            if (operation.equals("ADD")) {
                System.out.println("Enter the Product name: ");
                String name = sc.next();
                System.out.println("Enter the Product price: ");
                int price = sc.nextInt();

                boolean found = false;

                // Check if product already exists
                for (int j = 0; j < productCount; j++) {

                    if (products[j].name.equals(name)) {
                        found = true;
                        break;
                    }
                }

                // Add only if product does not exist
                if (!found) {
                    products[productCount] = new Product(name, price);
                    productCount++;
                }
            }

            // UPDATE operation
            else if (operation.equals("UPDATE")) {
                System.out.println("Enter the Product name: ");
                String name = sc.next();
                System.out.println("Enter the Updated Product price: ");
                int price = sc.nextInt();

                // Search for product
                for (int j = 0; j < productCount; j++) {

                    if (products[j].name.equals(name)) {
                        products[j].price = price;
                        break;
                    }
                }
            }

            // GET operation
            else if (operation.equals("GET")) {

                String name = sc.next();

                int price = -1;

                // Search for product
                for (int j = 0; j < productCount; j++) {

                    if (products[j].name.equals(name)) {
                        price = products[j].price;
                        break;
                    }
                }

                // Store result
                results[resultCount] = price;
                resultCount++;
            }
        }

        // Print results in array format
        System.out.print("[");

        for (int i = 0; i < resultCount; i++) {

            System.out.print(results[i]);

            if (i < resultCount - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

    }
}
