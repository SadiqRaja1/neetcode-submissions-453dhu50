class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = 0;
        Set<Integer> window = new HashSet<>();
        for(int r=0; r<nums.length; r++){
            if(window.size() > k){
                window.remove(nums[l]);
                l++;
            }
            if(window.contains(nums[r])) return true;
            window.add(nums[r]);
        }
        return false;
    }
}