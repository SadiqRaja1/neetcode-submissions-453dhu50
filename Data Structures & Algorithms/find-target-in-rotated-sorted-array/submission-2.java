class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        if(n == 0 ){
            return -1;
        }else if (n == 1){
            if(nums[0] == target){
                return 0;
            }else{
                return -1;
            }
        }

        int startIndex = findStart(nums);

        if(target >= nums[startIndex] && target <= nums[n-1]) {
            return binarySearch(nums, target, startIndex, n-1);
        }else {
            return binarySearch(nums, target, 0, startIndex-1);
        }
    }

    public int binarySearch(int [] nums, int target, int start,int end){

        while (start <= end){
            int mid = start + (end - start)/2;

            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    public int findStart(int []nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while (start < end) {
            int mid = start + (end - start)/2;
            if(mid < n-1 && nums[mid] > nums[mid+1]) {
                return mid+1;
            }else if ( nums[mid] > nums[end]){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return 0;
    }

}
