class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int index = 0;
        int ans [] = new int[n-k+1];

        Deque<Integer> dq = new ArrayDeque<>();

        for(int r=0; r<n; r++){
            if(!dq.isEmpty() && dq.peekFirst() < r-k+1){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[r]){
                dq.pollLast();
            }

            dq.offer(r);

            if(r >= k-1){
                if(index <n-k+1) {
                    ans[index] = nums[dq.peekFirst()];
                    index++;
                }
            }

        }

        return ans;
    }
}
