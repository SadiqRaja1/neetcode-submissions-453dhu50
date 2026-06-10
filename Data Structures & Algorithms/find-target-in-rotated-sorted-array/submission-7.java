class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int startInd = 0;

        while(start < end){
            int mid = start + (end-start)/2;

            if(nums[mid] > nums[mid+1]) {
                startInd = mid+1;
                break;
            }else if(nums[mid] > nums[end]){
                start = mid+1;
            }else {
                end = mid;
            }
        }

        int endInd = startInd != 0? startInd-1 : nums.length-1;
        int binStart = startInd;
        int binStop = endInd;

        if(nums[startInd] <= target && nums[n-1] >=target){
            binStart = startInd;
            binStop = n-1;
        }else {
            binStart = 0;
            binStop = endInd;
        }

        while(binStart <= binStop){
            int mid = binStart + (binStop - binStart)/2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) binStop = mid-1;
            else binStart = mid+1;
        }

        return -1;
    }
}
