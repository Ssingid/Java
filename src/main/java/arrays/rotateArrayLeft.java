package arrays;

import java.util.Scanner;

public class rotateArrayLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray=readArray.readingArray();


        System.out.print("Enter the number of positions to rotate the array left: ");
        int rotations = scanner.nextInt();


        rotateLeft(originalArray, rotations);


        System.out.println("\nRotated Array:");
        displayArray.displayingArray(originalArray);

    }

    private static void rotateLeft(int[] arr, int x) {
        int length = arr.length;

        x = x % length;

        int[] temp = new int[length];

        for (int i = 0; i < length; i++) {
            temp[(i - x + length) % length] = arr[i];
        }

        System.arraycopy(temp, 0, arr, 0, length);
    }
}
