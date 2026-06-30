class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for(int num : nums){
            set.add(num);
        }

        for(int num : nums){
            if(set.contains(num-1)) continue;
            int helper = num;
            int currMax = 1;
            while(set.contains(helper+1)){
                currMax++;
                helper++;
            }

            max = Math.max(max, currMax);
        }

        return max;
    }
}
