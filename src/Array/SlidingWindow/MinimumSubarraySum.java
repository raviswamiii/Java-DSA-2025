package Array.SlidingWindow;

public class MinimumSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // add current number to sum

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++; // shrink the window from the left
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args){
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        MinimumSubarraySum obj = new MinimumSubarraySum();
        int result = obj.minSubArrayLen(target, nums);

        System.out.println("Minimal length of the subarray is " + result);
    }
}
