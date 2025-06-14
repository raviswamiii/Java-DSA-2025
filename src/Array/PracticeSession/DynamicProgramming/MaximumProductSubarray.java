package Array.PracticeSession.DynamicProgramming;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums){
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++){
            int current = nums[i];

            if(current < 0){
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(current, current * maxSoFar);
            minSoFar = Math.min(current, current * minSoFar);
            result = Math.max(result, maxSoFar);

        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {2,3,-2,4};
        MaximumProductSubarray obj = new MaximumProductSubarray();
        int result = obj.maxProduct(nums);
        System.out.println("Maximum product is: " + result);
    }
}
