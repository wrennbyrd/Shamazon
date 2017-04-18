import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cart cart = new Cart();
        boolean keepRunningShamazon = true;

        ProductListFactory productListFactory = new ProductListFactory();
        ArrayList<Product> productList = productListFactory.GenerateProductList();

        ProductSelectScreen productSelectScreen = new ProductSelectScreen();

        //probably return the cart eventually so we can do different things
        //once cart is returned we can run product select and cart management here in a loop
        //then this would be the loop that controls exiting the program, product selection
        //loop would exit product selection instead

        //todo write manual test cases for the product selection cases

        while (keepRunningShamazon) {
            Product selectedProduct = productSelectScreen.select(productList);

            cart.manageCart(selectedProduct);

            keepRunningShamazon = decisionToExitShamazon(keepRunningShamazon);
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
