package Array.SubsetsAndCombinations;
import java.util.*;

public class Subsets {
    // Main function to generate all subsets
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    // Backtracking helper function
    private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); // Add current subset

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);                    // Choose
            backtrack(i + 1, nums, current, result); // Explore
            current.remove(current.size() - 1);      // Un-choose (backtrack)
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Subsets sg = new Subsets();

        int[] nums = {1, 2, 3}; // You can change input here

        List<List<Integer>> subsets = sg.subsets(nums);

        System.out.println("All subsets:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
