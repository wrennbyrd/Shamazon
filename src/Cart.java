import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

    ArrayList<Product> productsInCart = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void manageCart(Product productSelected)  {

        boolean selectionInvalid = false;

        do {
            System.out.println("Press 1 to add to cart or 2 to return to the menu");

            int option = sc.nextInt();

            if (option == 3) {

                for (Product product : productsInCart) {
                    System.out.println(product.name + " : " + product.price);
                }


            } else if (option == 2) {
                //do nothing which goes back to productSelection
            } else if (option == 1) {
                System.out.println("item added!\n");
                Util.sleep();
                productsInCart.add(productSelected);
                selectionInvalid = false;

            } else if (option < 1 || option > 2) {
                selectionInvalid = true;
            }

        } while (selectionInvalid);
    }

    void manage() {
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Press 1 to see a list of products in the cart" +
                    "\npress 2 to see your order total" +
                    "\npress 3 to exit cart management\n");
            int option = sc.nextInt();

            if (option == 1) {
                listProducts();
            } else if (option == 2) {
                viewOrderTotal();
            } else {
                keepRunning = false;
            }
        }
    }

    private void viewOrderTotal() {
        double orderTotal = 0;
        for (Product product : productsInCart) {
            orderTotal += product.price;
        }
        System.out.println("product total: " + Util.formatCurrency(orderTotal));

        double tax = orderTotal * .07;
        System.out.println("tax: " + Util.formatCurrency(tax));

        double shipping = 4;
        System.out.println("shipping: " + Util.formatCurrency(shipping));


        orderTotal += tax + shipping;

        System.out.println("order total: \n" + Util.formatCurrency(orderTotal));
    }

    private void listProducts() {
        for (Product product : productsInCart) {
            System.out.println(product.name + " : " + Util.formatCurrency(product.price));
        }
    }
}
