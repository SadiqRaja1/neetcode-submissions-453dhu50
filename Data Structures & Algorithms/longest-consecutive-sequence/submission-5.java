class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for(int num : nums) {
            set.add(num);
        }

        for(int num : set) {
            if(!set.contains(num-1)){
                int longest = 1;
                while(set.contains(num+longest)){
                    longest++;
                }
                max = Math.max(max, longest);
            }
        }

        return max;
    }
}
