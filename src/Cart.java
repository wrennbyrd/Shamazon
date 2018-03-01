import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

    ArrayList<Product> productsInCart = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addProduct(Product selectedItem){
        productsInCart.add(selectedItem);
    }

    public void manageCart() {

        boolean keepRunning = true;

        while (keepRunning){
            System.out.println("Press 1 to view items in cart");
            System.out.println("Press 2 to clear a single item in cart");
            System.out.println("Press 3 to clear all items in cart");
            System.out.println("Press 4 to exit the cart");

            int option = sc.nextInt();

            if (option == 1) {
                printAllItems();
            } else if (option == 2 ){
                removeItem();
            } else if (option == 3){
                productsInCart.clear();
                System.out.println("All items have been deleted from cart \n");

            } else if (option == 4) {
                keepRunning = false;
                System.out.println("returning to main menu \n");
            }
        }
    }

    private void printAllItems(){
        for (Product product : productsInCart){
            String name = product.name;
            int price = product.price;
            String description = product.description;

            System.out.println("$" + price + " - " + name);
            System.out.println(description + "\n");
        }
    }

    private void removeItem() {
        System.out.println("select an item to delete");

        int itemIndex = 1;

        for (Product product : productsInCart){
            String name = product.name;
            int price = product.price;

            System.out.println(itemIndex + " - " + "$" + price + " - " + name);
            itemIndex ++;
        }
        int itemSelected = sc.nextInt();
        Product removedProduct = productsInCart.remove(itemSelected - 1);
        System.out.println(removedProduct.name + " has been deleted from the cart \n");
    }
}
