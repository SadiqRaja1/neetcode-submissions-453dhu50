class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 1){
            return new int []{ nums[0]};
        }
        int n=nums.length;
        int ans [] = new int[n-k+1];

        for(int i=0; i<n-k+1; i++){
            int max = Integer.MIN_VALUE;
            for(int j=i; j<i+k; j++){
                if(j>n-1) break;
                max = Math.max(max,nums[j]);
            }
            ans[i] = max;
        }
        return ans;
    }
}
