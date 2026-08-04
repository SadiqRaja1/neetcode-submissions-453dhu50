class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.offer(num);
        }

        int helper = nums.length-k;

        for(int i=0; i<helper; i++){
            minHeap.poll();
        }

        return minHeap.peek();
    }
}
