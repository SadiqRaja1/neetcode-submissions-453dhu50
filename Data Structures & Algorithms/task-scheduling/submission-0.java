class Solution {
    public int leastInterval(char[] tasks, int n) {
        //step 1 count frequency of each task
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char task : tasks){
            freqMap.put(task, freqMap.getOrDefault(task,0)+1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);

        maxHeap.addAll(freqMap.values());

        int time = 0;

        //Step 3: Process Task
        while(!maxHeap.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            //One round = n+1 slots
            for(int i=0; i<=n; i++){
                if(!maxHeap.isEmpty()){
                    temp.add(maxHeap.poll());
                }
            }

            //Decrease frequency
            for(int freq : temp){
                freq--;
                if(freq > 0){
                    maxHeap.add(freq);
                }
            }

            //Update time
            if(maxHeap.isEmpty()) {
                time+=temp.size();
            }else {
                time+=n+1;
            }
        }

        return time;
    }
}
