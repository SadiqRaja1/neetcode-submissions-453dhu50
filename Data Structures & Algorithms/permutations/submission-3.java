class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        createPermu(nums, ans, 0);
        return ans;
    }

    public void createPermu(int nums[], List<List<Integer>> ans, int index){
        if(index == nums.length){
            List<Integer> curr = new ArrayList<>();
            for(int num : nums){
                curr.add(num);
            }
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index; i<nums.length; i++){
            swap(i,index,nums);
            createPermu(nums, ans, index+1);
            swap(i, index, nums);
        }
    }

    private void swap(int i, int j, int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
