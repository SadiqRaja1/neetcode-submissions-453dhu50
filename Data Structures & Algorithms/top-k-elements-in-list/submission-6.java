class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);

            maxFreq = Math.max(maxFreq, map.get(nums[i]));
        }

        HashMap<Integer, List<Integer>> count = new HashMap<>();

        for(int num : map.keySet()){
            if(!count.containsKey(map.get(num))){
                count.put(map.get(num), new ArrayList<>());
            }
            count.get(map.get(num)).add(num);
        }

        int index = 0;
        int answer [] = new int[k];

        for (int i = maxFreq; i >= 1; i--){
            if (count.containsKey(i)){
                for(int num : count.get(i)) {

                    answer[index] = num;
                    index++;
                    if(index == k) return answer;
                }
            }
        }
        
        return answer;
    }
}
