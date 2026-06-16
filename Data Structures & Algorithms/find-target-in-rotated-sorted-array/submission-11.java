class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1){
            return nums[0] == target? 0 : -1;
        }

        int startInd = findStart(nums);
        int  n = nums.length;

        if(nums[startInd] <=target && nums[n-1] >= target){
            return binSearch(nums,target,startInd,n-1);
        }else{
            return binSearch(nums,target,0,startInd-1);
        }

    }

    private int binSearch(int nums[], int target, int start, int end){
        while(start <= end){
            int mid = start+(end-start)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return -1;
    }

    private int findStart(int nums[]) {
        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            int mid = start + (end-start)/2;

            if(nums[mid] > nums[mid+1]) {
                return mid+1;
            }else if (nums[mid] > nums[end]){
                start = mid + 1;
            }else {
                end = mid;
            }
        }

        return 0;
    }
}
