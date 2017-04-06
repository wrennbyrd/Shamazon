import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

    ProductListFactory productListFactory = new ProductListFactory();

    ArrayList<Product> productList = productListFactory.GenerateProductList();

        int number = 0;

        for (Product currentProduct : productList){

            String name = currentProduct.name;
            int price = currentProduct.price;

            number = number + 1;


            System.out.println(number + " - $"+ price + " " + name + "\n");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Which item would you like to see the description of. Pick a number.");

        int itemNumber = sc.nextInt();
        itemNumber = itemNumber - 1;
        

        Product product = productList.get(itemNumber);

        String description = product.description;

        System.out.println(description);

    }




}
