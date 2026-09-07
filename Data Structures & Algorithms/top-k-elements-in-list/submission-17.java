class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int ans []= new int[k];
        int max = 0;
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
            max = Math.max(max, freq.get(num));
        }
        //System.out.println(freq);
        HashMap<Integer, List<Integer>> rev = new HashMap<>();
        for(int num : freq.keySet()){
            if(!rev.containsKey(freq.get(num))) {
                rev.put(freq.get(num), new ArrayList<>());
            }
            rev.get(freq.get(num)).add(num);
        }
        //System.out.println(rev);
        System.out.println(max);
        int index = 0;
        while(index < k){
            if(rev.containsKey(max)){
                List<Integer> curr = rev.get(max);
                for(int i=0; i<curr.size() && index < k; i++){
                    ans[index++] = curr.get(i);
                }
            }
            max--;
        }

        return ans;
    }
}
