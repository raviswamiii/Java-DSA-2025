package Array.SubsetsAndCombinations;

import java.util.*;

public class CombinationSum{
     public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> result = new ArrayList<>();
         backTrack(candidates, target, 0, new ArrayList<>(), result);
         return result;
     }

     private void backTrack(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result) {
         if(target == 0){
             result.add(new ArrayList<>(current));
             return;
         }

         for(int i = index; i < candidates.length; i++) {
             int candidate = candidates[i];

             if(candidate > target) continue;

             current.add(candidate);
             backTrack(candidates, target - candidate, i, current, result);
             current.remove(current.size() - 1);
         }

     }

     public static void main(String[] args){
         int[] candidates = {2,3,6,7};
         int target = 7;
         CombinationSum obj = new CombinationSum();
         List<List<Integer>> result = obj.combinationSum(candidates, target);

         System.out.println("All combinations that add to the target" + target + ":");
         for(List<Integer> combinations : result){
             System.out.println(combinations);
         }
     }
 }