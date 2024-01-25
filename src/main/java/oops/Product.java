package oops;

import java.util.*;
class Product {
    private double price;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getprice(int quantity){
        return quantity*price;
    }

    public static void main(String[] arg){
        Product P=new Product();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product price");
        int price=sc.nextInt();
        System.out.println("Enter the product Quantity");
        int q=sc.nextInt();
        P.setPrice(price);
        System.out.println("Single Quantity price"+price);
        System.out.println("oops.Product price for given quantity is"+P.getprice(q));

    }
}
