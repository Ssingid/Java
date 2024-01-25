package oops;

import java.util.*;

public class Polymorphysim {
    public static void main(String[] args){
        shape R=new Rectangle();
        shape S=new Square();
        int RA=R.Area();
        int SA=S.Area();
        System.out.println("Area of the rectangle is"+RA);
        System.out.println("Area of the oops.Square is "+SA);
    }
}
abstract class shape{
    Scanner sc=new Scanner(System.in);
    abstract public int Area();
}

class Rectangle extends shape{

    public int  Area(){
        System.out.println("Enter the length and breadth for rectangle");
        int l=sc.nextInt();
        int b=sc.nextInt();
        return (l*b);
    }
}

class Square extends shape{
    public int Area(){
        System.out.println("Enter the side for oops.Square");
        int s= sc.nextInt();
        return (s*s);
    }

}