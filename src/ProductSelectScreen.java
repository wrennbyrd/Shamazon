import java.util.ArrayList;
import java.util.Scanner;

public class ProductSelectScreen {

    Scanner sc = new Scanner(System.in);
    boolean keepRunning;

    Product product = null;


    public Product select(ArrayList<Product> productList) {

                keepRunning = true;

        while (keepRunning) {
            product = productSelection(sc, productList);
        }
        return product;
    }

    private Product productSelection(Scanner sc, ArrayList<Product> productList) {
        int number = 0;

        listEachProduct(productList, number);

        if (product != null) {
            System.out.println("You Have Currently Selected:\n" + product.name + " - " + product.description + "\n");
        }

        System.out.println("Pick a number to see a new products description. Or press 0 to exit product selection");

        Product product = new Product();

        int itemNumber = sc.nextInt();
        itemNumber = itemNumber - 1;

        if (itemNumber == -1) {
            keepRunning = false;
            System.out.println("Exiting Product Selection.");
        } else {
            product = productList.get(itemNumber);
        }
        return product;
    }

    private void listEachProduct(ArrayList<Product> productList, int number) {
        for (Product currentProduct : productList){

            String name = currentProduct.name;
            int price = currentProduct.price;

            number = number + 1;

            System.out.println(number + " - $"+ price + " " + name + "\n");
        }
    }
}


