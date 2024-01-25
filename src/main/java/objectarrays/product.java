package objectarrays;
import java.util.*;
public class product implements Comparable<product> {

    private int weight,price,id;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    product(int weight, int price, int id){
        this.weight=weight;
        this.price=price;
        this.id=id;
    }

    public int compareTo(product otherProduct) {
        // Compare products based on their price
        if(this.price>otherProduct.price){return 1;}
        else if(this.price<otherProduct.price){return -1;}
        return 0;
    }

    public static void main(String arg[]){
        // Create an unsorted array of products
        product[] products_List = {
                new product(2, 25, 101),
                new product(1, 19, 102),
                new product(3, 15, 103),
                new product(2, 30, 104)
        };
        // Display unsorted products
        System.out.println("Unsorted Products List:");
        System.out.printf("%-10s%-15s%-10s%n","Weight","Price","Id");
        for (product product : products_List)
            System.out.printf("%-10s%-15s%-10s%n",product.weight,product.price,product.id);
        Arrays.sort(products_List);
        System.out.println("sorted Products List:");
        System.out.printf("%-10s%-15s%-10s%n","Weight","Price","Id");
        for (product product : products_List)
            System.out.printf("%-10s%-15s%-10s%n",product.weight,product.price,product.id);


    }
}
