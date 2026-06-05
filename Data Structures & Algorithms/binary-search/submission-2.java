class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int m = (start + end)/2;
            System.out.print(m);
            if(nums[m] == target){
                System.out.print("herhe");
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
