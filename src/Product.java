import java.util.ArrayList;

public class Product {

    String name;

    int price;

    String description;

    public void bullshitMethod() {
        ProductListFactory productListFactory= new ProductListFactory();


        ArrayList<Product> productList = productListFactory.GenerateProductList();

    }

}
