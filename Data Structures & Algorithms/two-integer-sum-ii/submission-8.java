class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left < right) {
            int helper = numbers[left]+numbers[right];
            if(helper > target) {
                right--;
            }else if(helper < target) {
                left++;
            }else{
                return new int []{left+1, right+1};
            }
        }
        return new int[2];
    }
}
