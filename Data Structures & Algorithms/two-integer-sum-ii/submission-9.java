class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(start < end){
            int helper = numbers[start]+numbers[end];
            if(helper < target) {
                start++;
            }else if(helper > target) {
                end--;
            }else {
                return new int [] {start+1, end+1};
            }
        }
        return new int[]{};
    }
}
