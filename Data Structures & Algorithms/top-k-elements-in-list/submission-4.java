class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;

        for(int num : nums) {
            int freq = map.getOrDefault(num,0)+1;
            map.put(num, freq);
            maxFreq = Math.max(maxFreq, freq);
        }

        Map<Integer, List<Integer>> reverseMap = new HashMap<>();

        for(int key : map.keySet()){
            int count = map.get(key);
            if(reverseMap.containsKey(count)){
                reverseMap.get(count).add(key);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(key);

                reverseMap.put(count, list);
            }
        }

        int index = 0;
        int answer [] = new int[k];

        for (int i = maxFreq; i >= 1; i--){
            if (reverseMap.containsKey(i)){
                for(int num : reverseMap.get(i)) {

                    answer[index] = num;
                    index++;
                    if(index == k) return answer;
                }
            }
        }
        
        return answer;
    }
}
