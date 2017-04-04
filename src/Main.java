import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

    ProductListFactory productListFactory= new ProductListFactory();

    ArrayList<Product> productList = productListFactory.GenerateProductList();

        for (Product currentProduct : productList){

            String name = currentProduct.name;
            int price = currentProduct.price;

            System.out.println("$"+ price + " " + name + "\n");
        }


    }


}
