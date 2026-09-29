class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> check = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int helper = target-nums[i];
            if(check.containsKey(helper)) {
                return new int [] {check.get(helper), i};
            }
            check.put(nums[i], i);
        }
        return new int[] {};
    }
}
