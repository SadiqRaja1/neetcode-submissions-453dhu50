class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;

        HashSet<Integer> hash = new HashSet<>();

        for (int num : nums){
            hash.add(num);
        }

        for(int num : hash){
            if(!hash.contains(num-1)){
                int length = 1;
                while(hash.contains(num+length)) {
                    length++;
                }
                ans = Math.max(ans, length);
            }
        }
        
        return ans;
    }
}
