package Array.SubsetsAndCombinations;
import java.util.*;

public class Subsets2 {
    public List<List<Integer>> subsetsWithDuplicates(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backTrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i - 1]) continue;
            current.add(nums[i]);
            backTrack(i + 1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        Subsets2 obj = new Subsets2();
        List<List<Integer>> result = obj.subsetsWithDuplicates(nums);
        for(List<Integer> subset : result){
            System.out.println(subset);
        }
    }
}
