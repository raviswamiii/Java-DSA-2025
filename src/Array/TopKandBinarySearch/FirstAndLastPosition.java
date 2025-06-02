package Array.TopKandBinarySearch;

class FirstAndLastPosition {
    public static int[] firstAndLastPosition(int[] nums, int target){
        int first = findBound(nums, target, true);
        int last = findBound(nums, target, false);
        return new int[] {first, last};
    }

    private static int findBound(int[] nums, int target, boolean isFirst){
        int left = 0;
        int right = nums.length - 1;
        int bound = -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                bound = mid;

                if(isFirst){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return  bound;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        FirstAndLastPosition obj = new FirstAndLastPosition();
        int[] result = obj.firstAndLastPosition(nums, target);
        System.out.println("First and last index of " + target + ": " + "[" + result[0] + ", " + result[1] + "]");

    }
}