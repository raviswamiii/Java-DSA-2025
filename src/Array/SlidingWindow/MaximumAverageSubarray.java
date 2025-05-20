package Array.SlidingWindow;

class MaximumAverageSubarray {
    public double maximumAverageSubarray(int[] nums, int k) {
        double windowSum = 0;
        for(int i = 0; i < k; i++){
            windowSum = windowSum += nums[i];
        }

        double maxSum = windowSum;

        for(int i = k; i < nums.length; i++){
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        MaximumAverageSubarray obj = new MaximumAverageSubarray();
        double result = obj.maximumAverageSubarray(nums, k);

        System.out.println("Maximum average of subarray of length " + k + " is " + result);


    }
}