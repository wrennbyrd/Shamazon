import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Starting Shamazon");
        Cart cart = new Cart();

        ProductListFactory productListFactory = new ProductListFactory();
        ArrayList<Product> productList = productListFactory.GenerateProductList();
        ProductsForSale productsForSale = new ProductsForSale(productList);

        ProductSelectScreen productSelectScreen = new ProductSelectScreen();

        boolean keepRunningShamazon = true;

        Scanner sc = new Scanner(System.in);

        while (keepRunningShamazon) {

            System.out.println("Press 1 to go to product selection, 2 manage cart, and 3 to exit Shamazon");
            int selection = sc.nextInt();

            if (selection == 1){
                productSelectScreen.select(productsForSale, cart);

            } else if (selection == 2) {
                cart.manageCart();

            } else {
                keepRunningShamazon = false;
                System.out.println("Exiting Shamazon...");
            }
        }
    }

}
