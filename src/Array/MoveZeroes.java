package Array;

public class MoveZeroes {

        public void moveZeroes(int[] nums) {
            int j = 0; // position to place the next non-zero

            // Step 1: Move all non-zero elements to the front
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    j++;
                }
            }

            // Step 2: Fill the rest with zeros
            while (j < nums.length) {
                nums[j] = 0;
                j++;
            }
        }

        public static void main(String[] args) {
            int[] nums = {0, 1, 0, 3, 12};
            MoveZeroes mz = new MoveZeroes();
            mz.moveZeroes(nums);

            // Print result
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }


