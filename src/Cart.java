import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

    ArrayList<Product> productsInCart = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addProduct(Product selectedItem){
        productsInCart.add(selectedItem);
    }

    public void manageCart(Product productSelected) {

        boolean selectionInvalid = false;

        do {

            System.out.println("Press 1 to add to cart or 2 to return to the menu");

            int option = sc.nextInt();

            if (option == 2) {
                //do nothing which goes back to productSelection
            } else if (option == 1) {
                this.addProduct(productSelected);

            } else if (option < 1 || option > 2) {
                selectionInvalid = true;
            }

        } while (selectionInvalid);
    }
}
