import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ProductListFactory productListFactory = new ProductListFactory();
        ArrayList<Product> productList = productListFactory.GenerateProductList();

        ProductSelectScreen productSelectScreen = new ProductSelectScreen();

        //probably return the cart eventually so we can do different things
        productSelectScreen.select(productList);

    }

}
