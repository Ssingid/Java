package arrays;

public class moveZeros {
    public static void main(String[] args) {
        // Sample array
        int[] arr = readArray.readingArray();
        System.out.println("Original Array:");
        displayArray.displayingArray(arr);

        moveZerosToLast(arr);

        System.out.println("\nArray after moving zeros to the end:");
        displayArray.displayingArray(arr);
    }
    private static void moveZerosToLast(int[] nums) {
        int nonZeroIndex = 0;
        // Traverse the array and move non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex] = num;
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

}
