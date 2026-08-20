class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        creSubset(nums, ans, new ArrayList<>(), 0);
        return ans;
    }

    public void creSubset(int []nums, List<List<Integer>> ans, List<Integer> curr, int index) {
        ans.add(new ArrayList<>(curr));

        for(int i=index; i<nums.length; i++){
            if(i > index && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
            creSubset(nums, ans, curr, i+1);
            curr.remove(curr.size()-1);
            
        }
    }
}
