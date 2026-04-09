class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
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
        for (int i = nums.length; i >= 0; i--){
            if (reverseMap.containsKey(i)){
                if(index == k) break;
                for(int num : reverseMap.get(i)) {
                    answer[index] = num;
                    index++;
                }
                
            }
        }

        System.out.println(map);
        System.out.println(reverseMap);
        
        return answer;
    }
}
