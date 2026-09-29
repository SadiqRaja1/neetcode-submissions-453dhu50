class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int max = 0;
        for(int num :  nums) {
            freq.put(num, freq.getOrDefault(num,0)+1);
            max = Math.max(max, freq.get(num));
        }
        HashMap<Integer, List<Integer>> rev = new HashMap<>();
        for(int num : freq.keySet()) {
            int curr = freq.get(num);
            if(!rev.containsKey(curr)) {
                rev.put(curr, new ArrayList<>());
            }
            rev.get(curr).add(num);
        }
        int ans [] = new int[k];
        int index = 0;
        while(index < k){
            if(rev.containsKey(max)){
                List<Integer> currList = rev.get(max);
                for(int i=0; i<currList.size() && index < k; i++){
                    ans[index++] = currList.get(i);
                }
            }
            max--;
        }
        return ans;
    }
}
