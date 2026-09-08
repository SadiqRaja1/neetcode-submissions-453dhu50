class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int ans = 0;
        for(int num : nums){
            numSet.add(num);
        }
        for(int num : numSet){
            if(numSet.contains(num-1)) continue;
            int temp = num;
            int currMax = 1;
            while(numSet.contains(temp+1)) {
                currMax++;
                temp++;
            }
            ans = Math.max(ans, currMax);
        }

        return ans;
    }
}
