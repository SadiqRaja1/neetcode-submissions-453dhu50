class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n= nums.length;
        int ans [] = new int[2];

        for(int i=0; i<n; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i< n; i++){
            int helper = target - nums[i];
            if(map.containsKey(helper) && map.get(helper) != i){
                ans[0] = i;
                ans[1] = map.get(helper);
                break;
            }
        }

        return ans;
    }
}
