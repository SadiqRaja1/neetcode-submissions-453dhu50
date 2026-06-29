class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, List<Integer>> reverseMap = new HashMap<>();

        int max = Integer.MIN_VALUE;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            max = Math.max(max, map.get(num));
        }

        for(int num : map.keySet()){
            if(!reverseMap.containsKey(map.get(num))) {
                reverseMap.put(map.get(num), new ArrayList<>());
            }
            reverseMap.get(map.get(num)).add(num);
        }

        int index = 0;
        int ans [] = new int[k];

        while(index < k){
            if(reverseMap.containsKey(max)) {
                List<Integer> list = reverseMap.get(max);
                for(int i=0; i<list.size() && index < k; i++) {
                    ans[index] = list.get(i);
                    index++;
                }
            }
            
            max--;
        }

        return ans;
    }
}
