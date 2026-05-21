class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        if(!set.contains(0)) return 0;

        int ans = 0;

        for(int i=1; i<=nums.length; i++){
            int curr = i;
            if(!set.contains(curr)){
                ans = curr;
                break;
            }
        }
        return ans;
    }
}
