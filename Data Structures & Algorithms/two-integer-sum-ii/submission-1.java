class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int sum = 0;
        int start = 0;
        int end = n-1;
        int ans [] = new int[2];

        while(start < end) {
            sum = numbers[start] + numbers[end];
            if(sum == target) {
                ans[0] = start+1;
                ans[1] = end+1;
                return ans;
            }else if(sum > target) {
                end--;
            }else {
                start++;
            }
        }

        return ans;
    }
}
