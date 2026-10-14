class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(set.contains(num-1)) continue;
            int temp = num;
            int curr = 1;
            while(set.contains(temp+1)) {
                curr++;
                temp++;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}
