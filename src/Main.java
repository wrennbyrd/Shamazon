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

        while (keepRunningShamazon) {
            keepRunningShamazon = decisionToExitShamazon(keepRunningShamazon);

            if (keepRunningShamazon){
                productSelectScreen.select(productsForSale, cart);

                //todo
                //cart.manageCart(null);
            }
        }
    }

    private static boolean decisionToExitShamazon(boolean keepRunningShamazon) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to go to product selection or 2 to exit Shamazon");
        int selection = sc.nextInt();
        if (selection == 2) {
            keepRunningShamazon = false;
            System.out.println("Exiting Shamazon...");
        }
        return keepRunningShamazon;
    }

}
