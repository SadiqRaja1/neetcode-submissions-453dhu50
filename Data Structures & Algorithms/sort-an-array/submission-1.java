class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length-1);
        return nums;
    }

    public void divide(int[] nums, int start, int end){
        if(start >= end) {return;}
        int mid = start + (end-start)/2;
        divide(nums, start, mid);
        divide(nums, mid+1, end);
        conquer(nums, start, mid, end);
    }

    public void conquer(int[]nums, int start, int mid, int end){
        // System.out.println(nums.length);
        int merged[] = new int[end-start+1];
        // System.out.println(merged.length);
        int idx1 = start;
        int idx2 = mid+1;
        int index = 0;

        while(idx1 <= mid && idx2 <= end){
            if(nums[idx1] <= nums[idx2]){
                merged[index++] = nums[idx1++]; 
            }else {
                merged[index++] = nums[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[index++] = nums[idx1++];
        }
        while(idx2 <= end) {
            merged[index++] = nums[idx2++];
        }

        for(int i=0; i<merged.length; i++){
            nums[start+i]=merged[i];
        }
    }
}