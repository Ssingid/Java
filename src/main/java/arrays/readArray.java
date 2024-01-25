package arrays;
import java.util.*;
import java.lang.*;
public class readArray {
    public static int[] readingArray(){

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int i = s.nextInt();
        int[] arr=new int[i];
        for(int j=0; j<i ; j++){
            System.out.printf("Enter arr[%d] :",j);
            arr[j]=s.nextInt();
        }
        return arr;

    }


}
