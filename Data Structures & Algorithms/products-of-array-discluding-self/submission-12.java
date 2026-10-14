class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans [] = new int[n];
        for(int i=0; i<n; i++) {
            ans[i] = 1;
        }
        int helper = 1;
        for(int i=0; i<n; i++){
            ans[i] *= helper;
            helper *= nums[i];
        }
        helper = 1;
        for(int i = n-1; i>=0; i--) {
            ans[i] *= helper;
            helper *= nums[i];
        }
        return ans;
    }
}  
