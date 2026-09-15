class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numWithIndex = new HashMap<>();
        int ans[]=new int[2];
        for(int i=0; i<nums.length; i++) {
            int helper = target - nums[i];
            if(numWithIndex.containsKey(helper)){
                ans[0] = numWithIndex.get(helper);
                ans[1] = i;
                return ans;
            }
            numWithIndex.put(nums[i], i);
        }
        return ans;
    }
}
