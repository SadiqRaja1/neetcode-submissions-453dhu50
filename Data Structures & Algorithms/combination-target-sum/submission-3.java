class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(ans, nums, target, new ArrayList<>(), 0);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans, int nums[], int target, List<Integer> curr, int start){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=start; i<nums.length; i++) {
            if(target-nums[i] < 0){
                break;
            }
            curr.add(nums[i]);
            backtrack(ans, nums, target-nums[i], curr, i);
            curr.remove(curr.size()-1);
        }
    }
}
