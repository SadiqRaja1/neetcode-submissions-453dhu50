class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int r=0; r<nums.length; r++){
            int curr = nums[r];
            if(map.containsKey(curr)){
                if (Math.abs(map.get(curr)-r) <= k) return true;
            }
            map.put(curr, r);
        }
        return false;
    }
}