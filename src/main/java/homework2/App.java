package homework2;

public class App {

    public static void main(String[] args) {
        Product product1=new Product();
        product1.setId(1L);
        product1.setDescription("tooth");
        product1.setPrice(100.0);
        product1.setQuantity(100);

        System.out.println(product1);
    }
}
