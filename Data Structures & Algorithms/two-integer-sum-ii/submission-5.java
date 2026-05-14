class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int ans [] = new int[2];

        while(start < end){
            int helper = numbers[start] + numbers[end];
            if(helper == target){
                ans[0] = start+1;
                ans[1] = end+1;
                break;
            }else if (helper > target){
                end--;
            }else{
                start++;
            }
        }
        
        return ans;
    }
}
