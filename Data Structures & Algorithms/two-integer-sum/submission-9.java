class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for(int i = 0; i<n; i++){
            int helper = target - nums[i];
            if(map.containsKey(helper)){
                return new int[] {map.get(helper), i};
            }
            map.put(nums[i], i);
        }

        return new int[2];
    }
}
