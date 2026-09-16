class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums) {
            numSet.add(num);
        }

        for(int num : numSet){
            if(numSet.contains(num-1)) continue;
            int currLength = 1;
            int temp = num;
            while(numSet.contains(temp+1)) {
                currLength++;
                temp++;
            }
            maxLength = Math.max(maxLength, currLength);
        }
        return maxLength;
    }
}
