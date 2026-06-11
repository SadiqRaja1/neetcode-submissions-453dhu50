class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1){
            return nums[0] == target? 0 : -1;
        }
        int startIndex = findStart(nums);
        int n = nums.length;

        if(target >= nums[startIndex] && target <= nums[n-1]){
            return binarySearch(nums, target, startIndex, n-1);
        } else{
            return binarySearch(nums, target, 0, startIndex-1);
        }

    }

    public int binarySearch(int nums[], int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return -1;
    }

    public int findStart(int nums []){
        int start = 0 ;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end- start)/2;

            if(nums[mid] > nums[mid+1]) {
                return mid+1;
            }else if(nums[mid] > nums[end]){
                start = mid + 1;
            }else {
                end = mid;
            }
        }

        return 0;

    }
}
