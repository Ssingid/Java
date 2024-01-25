package arrays;
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = readArray.readingArray();

        System.out.println("Original Array:");
        displayArray.displayingArray(arr);

        bubbleSorting(arr);

        System.out.println("\nArray after sorting:");
        displayArray.displayingArray(arr);
    }

    // Function to perform Bubble Sort on an array
    static int[] bubbleSorting(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;
    }

}
