class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans [] = new int[k];
        int n= nums.length;

        int max = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0)+1);

            max = Math.max(max,freq.get(num));
        }

        HashMap<Integer, List<Integer>> rev = new HashMap<>();

        for(int num : freq.keySet()){
            if(!rev.containsKey(freq.get(num))){
                rev.put(freq.get(num), new ArrayList<>());
            }
            
            rev.get(freq.get(num)).add(num);
        }

        int index = 0;


        for(int i=max; i>0 && index < k; i--){
            if(rev.containsKey(i)) {
                List<Integer> l = rev.get(i);
                while(!l.isEmpty()) {
                    ans[index] = l.remove(0);
                    index++;
                }
            }
        }

        return ans;
    }
}
