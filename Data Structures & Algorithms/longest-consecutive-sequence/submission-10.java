class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int ans = 1;
        for(int num : nums){
            set.add(num);
        }
        System.out.println(set);

        for(int num : set){
            if(set.contains(num-1)) continue;
            int curr = 1;
            int temp = num;
            while(set.contains(temp+1)){
                curr++;
                temp++;
            }
            ans = Math.max(ans, curr);
        }

        return ans;
    }
}
