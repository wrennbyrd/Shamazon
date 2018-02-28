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

            System.out.println("Press 1 to view items in cart and 2 to return to the main menu");

            int option = sc.nextInt();

            if (option == 1) {
                printAllItems();
            } else if (option == 2) {
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

}
