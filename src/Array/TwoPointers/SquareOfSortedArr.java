package Array.TwoPointers;

public class SquareOfSortedArr {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};  // 🔹 This is where you give the input
        SquareOfSortedArr obj = new SquareOfSortedArr();
        int[] result = obj.sortedSquares(nums);

        // Printing the output
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }

        return result;
    }
}

