class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prev = 1;
        int post = 1;
        int n = nums.length;

        int ans [] = new int[n];

        for(int i=0; i<n; i++){
            ans[i] = 1;
        }

        for(int i=0; i<n; i++){
            ans[i] *= prev;
            prev *= nums[i];
        }

        for(int i=n-1; i>=0; i--){
            ans[i] *= post;
            post *= nums[i];
        }

        return ans;
    }
}  
