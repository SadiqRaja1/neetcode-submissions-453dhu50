class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        createSubset(nums, ans, 0, new ArrayList<>());
        return ans;
    }

    public void createSubset(int nums[], List<List<Integer>> ans, int index, List<Integer> curr) {
        ans.add(new ArrayList<>(curr));
        
        for(int i=index; i<nums.length; i++){
            if(i > index && nums[i] == nums[i-1]) {
                continue;
            }
            curr.add(nums[i]);
            createSubset(nums, ans, i+1, curr);
            curr.remove(curr.size()-1);
        }
    }
}
