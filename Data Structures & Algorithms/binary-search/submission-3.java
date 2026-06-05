class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int m = start + (end-start)/2;
            if(nums[m] == target){
                return m;
            }else if(nums[m] < target){
                start = m+1;
            }else{
                end = m-1;
            }
        }
        return -1;
    }
}
