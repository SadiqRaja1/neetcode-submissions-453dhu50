class Solution {
    public int leastInterval(char[] tasks, int n) {
        //Step 1 freqMap
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char ch : tasks) {
            freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);
        }

        //Step 2
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        maxHeap.addAll(freqMap.values());
        int time = 0;
        while(!maxHeap.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(int i=0; i<=n; i++){
                if(!maxHeap.isEmpty()) {
                    temp.add(maxHeap.poll());
                }
            }
            for(int freq : temp){
                freq--;
                if(freq > 0){
                    maxHeap.offer(freq);
                }
            }

            if(maxHeap.isEmpty()) {
                time+=temp.size();
            }else {
                time+=n+1;
            }
        }
        return time;
    }
}
