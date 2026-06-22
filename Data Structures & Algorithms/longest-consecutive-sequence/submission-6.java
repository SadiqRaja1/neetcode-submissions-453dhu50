class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int count = 0;

        for(int num : set){
            if(set.contains(num-1)) continue;

            int helper = 1;
            int copy = num;
            while(set.contains(copy+1)){
                helper++;
                copy++;
            }

            count = Math.max(count, helper);
        }

        return count;
    }
}
