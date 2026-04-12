class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prev = 1;
        int post = 1;
        int answer [] = new int[n];

        for (int i=0; i<n; i++){
            answer[i]=1;
        }

        for(int i=0; i<n; i++) {
            answer[i] *= prev;
            prev *=nums[i];
        }

        for(int i=n-1; i>=0; i--){
            answer[i] *= post;
            post *=nums[i];
        }

        return answer;
    }
}  
