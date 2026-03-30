class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap <Integer, Integer> hash = new HashMap<>();
        int answer [] = new int [2]; 

        for (int i = 0; i< nums.length; i++) {
            hash.put( nums[i], i);
        }

        for(int i=0; i<nums.length; i++) {
            int helper = target - nums[i];

            if(hash.containsKey(helper) && hash.get(helper) !=i) {
                answer[0] = i;
                answer[1] = hash.get(helper);
                return answer;
            }
        }

        return answer;
    }
}
