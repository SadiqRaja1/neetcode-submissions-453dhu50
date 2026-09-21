class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCount = 0;
        HashSet<Integer> numsCopy = new HashSet<>();
        for(int num : nums) {
            numsCopy.add(num);
        }
        for(int num : numsCopy) {
            if(numsCopy.contains(num-1)) continue;
            int currMax = 1;
            int temp = num;
            while(numsCopy.contains(temp+1)) {
                currMax++;
                temp++;
            }
            maxCount = Math.max(maxCount, currMax);
        }

        return maxCount;
    }
}
