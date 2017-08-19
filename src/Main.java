import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Starting Shamazon");
        Cart cart = new Cart();

        ProductListFactory productListFactory = new ProductListFactory();
        ArrayList<Product> productList = productListFactory.GenerateProductList();

        ProductSelectScreen productSelectScreen = new ProductSelectScreen();

        //probably return the cart eventually so we can do different things
        //once cart is returned we can run product select and cart management here in a loop
        //then tsionToExitShamazon(keepRunningShamazon);

            if (keepRunningShamazon){
                Product selectedProduct = productSelectScreen.select(productList);

                cart.manageCart(selectedProduct);
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
