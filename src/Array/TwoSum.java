package Array;
import java.util.HashMap;

public class TwoSum {
// Brute force
//    public int[] TwoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[] {i, j};
//                }
//            }
//        }
//        return new int[] {};
//    }
//
//    public static void main(String[] args) {
//        TwoSum ts = new TwoSum();
//        int[] nums = {2,3,4,5};
//        int target = 7;
//        int[] result = ts.TwoSum(nums, target);
//        System.out.println("indices: " + result[0] + ", " + result[1]);
//    }

// Optimized
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if(map.containsKey(complement)) {
                    return new int[] { map.get(complement), i };
                }
                map.put(nums[i], i);
            }
            return new int[] {};
        }

        public static void main(String[] args){
            int[] nums = {2,7,11,15};
            int target = 9;
            TwoSum sol = new TwoSum();
            int[] result = sol.twoSum(nums, target);
            System.out.println(result[0] + ", " + result[1]);  // Output: 0, 1
        }
    }




