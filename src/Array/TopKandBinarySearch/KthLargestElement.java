package Array.TopKandBinarySearch;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        // Min-heap to store the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num); // Add current number to heap

            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest if size > k
            }
        }

        // The root of the heap is the kth largest element
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 4;
        int result = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}

