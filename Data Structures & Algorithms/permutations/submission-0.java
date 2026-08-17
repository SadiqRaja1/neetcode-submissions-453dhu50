class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        recurPermute(nums, ans, new ArrayList<>(), freq);
        return ans;
    }
    public void recurPermute(int []nums, List<List<Integer>> ans, List<Integer> curr, boolean freq[]) {
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0; i<nums.length; i++) {
            if(!freq[i]) {
                freq[i] = true;
                curr.add(nums[i]);
                recurPermute(nums, ans, curr, freq);
                curr.remove(curr.size()-1);
                freq[i] = false;
            }
        }
    }
}
