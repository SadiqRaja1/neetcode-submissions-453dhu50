class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueInt = new HashSet<>();

        for(int num : nums){
            if(uniqueInt.contains(num)){
                return true;
            }
            uniqueInt.add(num);
        }

        return false;
    }
}