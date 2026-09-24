class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int start = i+1;
            int end = nums.length-1;
            while(start < end){
                int helper = nums[i]+nums[start]+nums[end];
                if(helper < 0) {
                    start++;
                }else if(helper > 0) {
                    end--;
                }else {
                    List<Integer> curr = new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[start]);
                    curr.add(nums[end]);
                    ans.add(curr);
                    start++;
                    end--;

                    while(start < end && nums[start] == nums[start-1]){
                        start++;
                    }
                    while(end < nums.length && start < end && nums[end] == nums[end+1]) {
                        end--;
                    }
                }
            }
        }
        return ans;
    }
}
