import java.util.Scanner;

public class ProductSelectScreen {

    Scanner sc = new Scanner(System.in);
    boolean keepRunning;
    Cart cart;

    public void select(ProductsForSale productsForSale, Cart cart) {

        this.cart = cart;

        productsForSale.listEachProduct();

        keepRunning = true;

        while (keepRunning) {
            productSelectionMenu(sc, productsForSale);
        }
    }

    private void productSelectionMenu(Scanner sc, ProductsForSale productListForSale) {

        System.out.println("Pick a number to see a new products description. Or press 0 to exit product selection");

        int itemNumber = sc.nextInt();

        if (itemNumber > productListForSale.products.size() || itemNumber < 0){
            return;
        }

        itemNumber = itemNumber - 1;

        if (itemNumber == -1) {
            keepRunning = false;
            System.out.println("Exiting Product Selection.");
        } else {
            Product selectedProduct = productListForSale.products.get(itemNumber);
            manageSelectedItemMenu(selectedProduct);

        }
    }

    private void manageSelectedItemMenu(Product product)  {

        System.out.println("You Have Currently Selected:\n" + product.name + " - " + product.description + "\n");

        Boolean keepRunningSelectedItem = true;

        while (keepRunningSelectedItem) {
            System.out.println("Press 1 to add to cart or press 0 to exit product selection");


            int itemNumber = sc.nextInt();
            itemNumber = itemNumber - 1;

            if (itemNumber == -1) {
                keepRunning = false;
                keepRunningSelectedItem = false;

                System.out.println("Exiting Product Selection.");
            } else if (itemNumber == 0) {
                keepRunning = false;
                keepRunningSelectedItem = false;
                cart.addProduct(product);
            }
        }

    }

}


