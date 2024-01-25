package arrays;
import java.util.*;

public class binarySearch {
    public static void main(String[] args) {

        int[] arr = readArray.readingArray();
        System.out.println("UnSorted Array:");
        displayArray.displayingArray(arr);
        int[] sortedarr = bubbleSort.bubbleSorting(arr);

        System.out.println("Sorted Array:");
        displayArray.displayingArray(sortedarr);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Element to search :");
        int i = s.nextInt();

        int index = binarySearchArray(arr, i);

        if (index != -1) {
            System.out.println("\nElement " + i + " found at index " + index);
        }
        else {
            System.out.println("\nElement " + i + " not found in the array");
        }
    }

    // Function to perform Binary Search on a sorted array
    private static int binarySearchArray(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
