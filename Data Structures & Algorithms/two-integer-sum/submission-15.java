class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans [] = new int[2];
        for(int i=0; i<nums.length; i++) {
            int helper = target - nums[i];
            if(map.containsKey(helper)) {
                ans[0] = map.get(helper);
                ans[1] = i;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
