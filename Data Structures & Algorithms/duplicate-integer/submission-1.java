class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<Integer>();

        for(int num : nums) {
            h.add(num);
        }

       if(h.size() != nums.length) {
        return true;
       }

       return false;
    }
}