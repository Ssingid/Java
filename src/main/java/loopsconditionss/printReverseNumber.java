package loopsconditionss;

import java.util.Scanner;

public class printReverseNumber {

    public int ReverseNumber(int i){
        int temp,r=0;
        //System.out.println(i);
        while(i>0){
            temp=i%10;
            r=r*10;
            r=r+temp;
            i=i/10;
        }
        return r;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int i=s.nextInt();
        printReverseNumber p=new printReverseNumber();
        System.out.println("Reverse Number " + p.ReverseNumber(i));

    }


}

