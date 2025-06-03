package Array.TopKandBinarySearch;

public class RotatedSortedArray {
    public int search(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            } else {
                if(nums[right] >= target && target > nums[mid]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        RotatedSortedArray obj = new RotatedSortedArray();
        int result = obj.search(nums, target);
        System.out.println("Index of the " + target + " in the rotated sorted array is " + result);
    }
}
