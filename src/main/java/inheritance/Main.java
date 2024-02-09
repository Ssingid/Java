package inheritance;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setPrice(10.0);
        System.out.println("Price of product: " + product.getPrice());
        System.out.println("Updated price of product: " + product.getPrice(5));
    }
}
