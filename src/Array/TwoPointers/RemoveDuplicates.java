package Array.TwoPointers;

// Brute Force ---
// public class RemoveDuplicates {
//    public static int removeDuplicates(int[] nums) {
//        // If array is empty or has only 1 element, it's already unique
//        if (nums.length == 0) return 0;
//
//        // Pointer i tracks the last unique element
//        int i = 0;
//
//        // Start j from 1 and compare with i
//        for (int j = 1; j < nums.length; j++) {
//            // If a new unique element is found
//            if (nums[j] != nums[i]) {
//                i++; // move i forward
//                nums[i] = nums[j]; // copy unique element to correct place
//            }
//        }
//
//        // i is index of last unique element, so total unique elements = i + 1
//        return i + 1;
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5};
//        int k = removeDuplicates(nums);
//
//        // Print first k elements
//        for (int i = 0; i < k; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println("\nUnique count: " + k);
//    }
//}

// Optimized ---


