class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, nums, new ArrayList<>(), 0);
        return ans;
    }

    public void backtrack(List<List<Integer>> ans, int nums[], List<Integer> curr, int start){
        ans.add(new ArrayList<>(curr));

        for(int i=start; i<nums.length; i++){
            curr.add(nums[i]);
            backtrack(ans, nums, curr, i+1);
            curr.remove(curr.size()-1);
        }
    }
}
