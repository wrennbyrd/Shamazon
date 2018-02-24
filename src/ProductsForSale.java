import java.util.List;

public class ProductsForSale {


    List<Product> products;

    public ProductsForSale(List<Product> products){
        this.products = products;
    }

    public void listEachProduct() {

        int numericalIndexForList = 0;

        for (Product currentProduct : products){

            String name = currentProduct.name;
            int price = currentProduct.price;

            numericalIndexForList = numericalIndexForList + 1;

            System.out.println(numericalIndexForList + " - $"+ price + " " + name + "\n");
        }
    }


}
