class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int ans [] = new int[k];

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
            max =Math.max(max, map.get(i));
        }

        HashMap<Integer, List<Integer>> help = new HashMap<>();

        for(int i : map.keySet()){
            if(!help.containsKey(map.get(i))){
                help.put(map.get(i), new ArrayList<>());
            }
            help.get(map.get(i)).add(i);
        }

        int index = 0;
        while (index < k){
            if(help.containsKey(max)){
                List<Integer> list = help.get(max);
                for(int i=0; i<list.size() && index < k; i++){
                    ans[index] = list.get(i);
                    index++;
                }
            }
            max--;
        }
        return ans;
    }
}
