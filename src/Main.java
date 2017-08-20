import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Starting Shamazon");
        Cart cart = new Cart();

        ProductListFactory productListFactory = new ProductListFactory();
        ArrayList<Product> productList = productListFactory.GenerateProductList();

        ProductSelectScreen productSelectScreen = new ProductSelectScreen(cart);

        boolean keepRunningShamazon = true;

        while (keepRunningShamazon) {
            keepRunningShamazon = mainMenu(keepRunningShamazon, cart);

            if (keepRunningShamazon){
                productSelectScreen.select(productList);
            }
        }
    }

    private static boolean mainMenu(boolean keepRunningShamazon, Cart cart) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to go to product selection or 2 to manage your cart or 3 to exit Shamazon");
        int selection = sc.nextInt();
        if (selection == 3) {
            keepRunningShamazon = false;
            System.out.println("Exiting Shamazon...");
        } else if (selection == 2) {
            cart.manage();
        }
        return keepRunningShamazon;
    }

}
