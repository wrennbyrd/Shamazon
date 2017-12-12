import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Starting Shamazon");
        Cart cart = new Cart();

        ProductListFactory productListFactory = new ProductListFactory();
        ArrayList<Product> productList = productListFactory.GenerateProductList();

        ProductSelectScreen productSelectScreen = new ProductSelectScreen();

        compile error
        //lets make ProductList its own type so it can have its display method inside itself
        //lets restrict the selection in the item management menu to 1 and 0 and
        //lets restrict the selection in the product selection to the size of the list

        boolean keepRunningShamazon = true;

        while (keepRunningShamazon) {
            keepRunningShamazon = decisionToExitShamazon(keepRunningShamazon);

            if (keepRunningShamazon){
                productSelectScreen.select(productList, cart);

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
