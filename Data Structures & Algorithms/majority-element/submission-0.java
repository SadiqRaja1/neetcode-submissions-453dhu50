class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = nums[0];
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(max) < map.get(num)) {
                max = num;
            }
        }

        return max;
    }
}