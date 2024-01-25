package arrays;

public class reversingarray {

    public static void main(String[] args) {

        int[] arr=readArray.readingArray();

        System.out.println("\nOriginal Array:");
        displayArray.displayingArray(arr);

        int temp=0;
        int first=0,last=arr.length-1;
        int mid=arr.length/2;

        for(int j=0; j<mid;j++){
            if(first==last)
                break;
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }

        System.out.println("\nReverse Array:");
        displayArray.displayingArray(arr);
    }
}
