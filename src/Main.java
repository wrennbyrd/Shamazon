import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

    ProductListFactory productListFactory= new ProductListFactory();

    ArrayList<Product> productList = productListFactory.GenerateProductList();


    }
}
