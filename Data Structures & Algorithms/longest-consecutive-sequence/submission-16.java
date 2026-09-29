class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> check = new HashSet<>();
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            check.add(nums[i]);
        }
        for(int num : check) {
            if(check.contains(num-1)) continue;
            int temp = num;
            int curr = 1;
            while(check.contains(temp+1)) {
                curr++;
                temp++;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}
