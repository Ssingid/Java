package arrays;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr=readArray.readingArray();

        System.out.println("\nOriginal Array:");
        int i=0;
        while(i<arr.length) {
            System.out.print(" "+arr[i]);
            i++;
        }

        System.out.println("\nReversed Array:");
        int j=arr.length-1;
        while(j>=0) {
            System.out.print(" "+arr[j]);
            j--;
        }


    }


}
