class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> uniqueNums = new HashSet<>();
        for(int num : nums) {
            uniqueNums.add(num);
        }

        for(int num : uniqueNums) {
            int currMax = 1;
            if(uniqueNums.contains(num-1)) continue;
            int helper = num;
            while(uniqueNums.contains(helper+1)) {
                helper++;
                currMax++;
            }
            max = Math.max(max, currMax);
        }

        return max;
    }
}
