import java.util.ArrayList;
import java.util.Scanner;

public class ProductSelectScreen {

    Scanner sc = new Scanner(System.in);
    boolean keepRunning;
    Cart cart;

    public void select(ArrayList<Product> productList, Cart cart) {

        this.cart = cart;

        listEachProduct(productList);

        keepRunning = true;

        while (keepRunning) {
            productSelectionMenu(sc, productList);
        }
    }

    private void productSelectionMenu(Scanner sc, ArrayList<Product> productList) {

        System.out.println("Pick a number to see a new products description. Or press 0 to exit product selection");

        int itemNumber = sc.nextInt();
        itemNumber = itemNumber - 1;

        if (itemNumber == -1) {
            keepRunning = false;
            System.out.println("Exiting Product Selection.");
        } else {
            Product selectedProduct = productList.get(itemNumber);
            manageSelectedItemMenu(selectedProduct);

        }
    }

    private void manageSelectedItemMenu(Product product)  {

        System.out.println("You Have Currently Selected:\n" + product.name + " - " + product.description + "\n");

        System.out.println("Press 1 to add to cart or press 0 to exit product selection");


        int itemNumber = sc.nextInt();
        itemNumber = itemNumber - 1;

        if (itemNumber == -1) {
            keepRunning = false;
            System.out.println("Exiting Product Selection.");
        } else if (itemNumber == 0) {
            keepRunning = false;
            cart.addProduct(product);
        }
    }

    private void listEachProduct(ArrayList<Product> productList) {

        int numericalIndexForList = 0;

        for (Product currentProduct : productList){

            String name = currentProduct.name;
            int price = currentProduct.price;

            numericalIndexForList = numericalIndexForList + 1;

            System.out.println(numericalIndexForList + " - $"+ price + " " + name + "\n");
        }
    }
}


