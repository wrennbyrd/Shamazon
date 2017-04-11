import java.util.ArrayList;
import java.util.Scanner;

public class ProductSelectScreen {

    Scanner sc = new Scanner(System.in);
    Cart cart = new Cart();
    boolean selectionInvalid = false;
    boolean keepRunning = true;

    public void select(ArrayList<Product> productList) {

        while (keepRunning) {

            Product productSelected;
            productSelected = productSelection(sc, productList);

            do {

                 productSubMenu(productSelected);

            } while (selectionInvalid);
        }
    }

    private Product productSelection(Scanner sc, ArrayList<Product> productList) {
        int number = 0;

        System.out.println("0 - EXIT SHAMAZON\n");

        listEachProduct(productList, number);

        System.out.println("Pick a number to see the products description. ");

        Product product = new Product();

        int itemNumber = sc.nextInt();
        itemNumber = itemNumber - 1;

        if (itemNumber == -1) {
            keepRunning = false;
            System.out.println("Exiting Shamazon.");
        } else {
            product = productList.get(itemNumber);

            String description = product.description;

            System.out.println(description + "\n");
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


    private void productSubMenu(Product product) {

        selectionInvalid = false;

        System.out.println("Press 1 to add to cart or 2 to return to the menu");

        int option = sc.nextInt();

        if (option == 2) {
            //do nothing which goes back to productSelection
        } else if (option == 1) {
            cart.addProduct(product);

        } else if (option < 1 || option > 2) {
            selectionInvalid = true;
        }
    }

}


