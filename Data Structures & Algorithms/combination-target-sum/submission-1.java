class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,nums,target,ans, new ArrayList<>());
        return ans;
    }

    public void findCombination(int ind, int [] nums, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(ind == nums.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(nums[ind] <= target){
            ds.add(nums[ind]);
            findCombination(ind, nums, target-nums[ind], ans, ds);
            ds.remove(ds.size()-1);
        }
        findCombination(ind+1, nums,target,ans,ds);
    }
}
