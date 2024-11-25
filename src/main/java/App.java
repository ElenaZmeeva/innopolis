import org.example.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Product product1= new Product(1L, "box", 100.0, 450);
        Product product2= new Product(2L, "socks", 200.0, 650);
        Product product3= new Product(3L, "brush", 250.0, 400);
        Product product4= new Product(4L, "knife", 100.0, 250);
        Product product5= new Product(5L, "spoon", 300.0, 300);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);

        ArrayList<Product> productList= new ArrayList<>();

        productList.add(new Product(1L, "box", 100.0, 450));
        productList.add(new Product(2L, "socks", 200.0, 650));
        productList.add(new Product(3L, "brush", 250.0, 400));
        productList.add(new Product(4L, "knife", 100.0, 250));
        productList.add(new Product(5L, "spoon", 300.0, 300));


        System.out.println(productList);
    }
}