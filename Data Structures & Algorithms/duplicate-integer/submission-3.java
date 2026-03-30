class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();

        for(int num : nums) {
            hash.add(num);
        }

        if(hash.size() == nums.length) {
            return false;
        }
        return true;
    }
}