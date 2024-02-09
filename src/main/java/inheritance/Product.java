package inheritance;

public class Product {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Overloaded method of price.
    public double getPrice(int quantity) {
        return quantity * price;
    }

}
