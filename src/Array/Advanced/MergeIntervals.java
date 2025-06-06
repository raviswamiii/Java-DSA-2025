package Array.Advanced;
import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        for(int[] interval : intervals){
            if(merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]){
                merged.add(interval);
            } else{
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args){
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        MergeIntervals obj = new MergeIntervals();
        int[][] result =  obj.merge(intervals);
        System.out.println("Merged Intervals:");
        for(int[] interval : result){
            System.out.println(Arrays.toString(interval));
        }
    }
}

