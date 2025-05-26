package Array.TopKandBinarySearch;
import java.util.*;

public class KthLargestElement{
    public static int kthlargestElement(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums){
            minHeap.add(num);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        KthLargestElement obj = new KthLargestElement();
        int result = obj.kthlargestElement(nums, k);
        System.out.println("The " + getOrdinal(k) + " largest element is: " + result);

    }

    public static String getOrdinal(int k) {
        if (k % 100 >= 11 && k % 100 <= 13) {
            return k + "th";
        }
        switch (k % 10) {
            case 1: return k + "st";
            case 2: return k + "nd";
            case 3: return k + "rd";
            default: return k + "th";
        }
    }

}