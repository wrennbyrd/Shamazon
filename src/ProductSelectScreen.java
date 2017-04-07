import java.util.ArrayList;
import java.util.Scanner;

public class ProductSelectScreen {

    Scanner sc = new Scanner(System.in);


    public void select(ArrayList<Product> productList) {

        boolean keepRunning = true;

        while (keepRunning) {

            productSelection(sc, productList);

            boolean selectionInvalid = false;

            do {
                selectionInvalid = false;

                System.out.println("Press 1 to add to cart or 2 to return to the menu or 3 to exit");

                int option = sc.nextInt();

                if (option == 3) {
                    keepRunning = false;
                    System.out.println("Exiting Shamazon.");
                } else if (option == 2) {
                    //do nothing which goes back to productSelection
                } else if (option < 1 || option > 3) {
                    selectionInvalid = true;
                }

            } while (selectionInvalid);
        }
    }

    private static void productSelection(Scanner sc, ArrayList<Product> productList) {
        int number = 0;
        for (Product currentProduct : productList){

            String name = currentProduct.name;
            int price = currentProduct.price;

            number = number + 1;
            
            System.out.println(number + " - $"+ price + " " + name + "\n");
        }

        System.out.println("Which item would you like to see the description of. Pick a number.");

        int itemNumber = sc.nextInt();
        itemNumber = itemNumber - 1;

        Product product = productList.get(itemNumber);

        String description = product.description;

        System.out.println(description + "\n");
    }

}


