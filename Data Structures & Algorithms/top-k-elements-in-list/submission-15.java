class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int num : nums){
           map.put(num, map.getOrDefault(num, 0)+1);
           max = Math.max(max, map.get(num));
        }

        HashMap<Integer, List<Integer>> revMap = new HashMap<>();
        for(int i : map.keySet()){
            if(!revMap.containsKey(map.get(i))){
                revMap.put(map.get(i), new ArrayList<>());
            }
            revMap.get(map.get(i)).add(i);
        }
        System.out.println(revMap);
        System.out.print(max);

        int ans [] = new int[k];
        int index =0;
        while(index < k){
            if(revMap.containsKey(max)){
                List<Integer> curr = revMap.get(max);
                for(int i=0; i<curr.size() && index < k; i++) {
                    ans[index++]=curr.get(i);
                }
            }
            max--;
        }
        return ans;
    }
}
