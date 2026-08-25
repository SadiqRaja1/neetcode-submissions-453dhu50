class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int helper = target - nums[i];
            if(freq.containsKey(helper)) {
                ans[0] = freq.get(helper);
                ans[1] = i;
                break;
            }
            freq.put(nums[i], i);
        }

        return ans;
    }
}
