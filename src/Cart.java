import java.util.ArrayList;

public class Cart {

    //prodcuts added
    //total
    //taxes
    //shipping

    ArrayList<Product> productsInCart = new ArrayList<>();

    public void addProduct(Product selectedItem){

        productsInCart.add(selectedItem);

    }
}
