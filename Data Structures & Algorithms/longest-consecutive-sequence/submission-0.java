class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        System.out.println(set);

        int longest = 0;

        for(int num : set){
            if(!set.contains(num-1)) {
                int length = 1;
                while(set.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
