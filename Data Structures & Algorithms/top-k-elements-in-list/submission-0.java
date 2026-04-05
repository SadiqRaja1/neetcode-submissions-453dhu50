class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int answer [] = new int[k];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else {
                map.put(num, 1);
            }
        }
        
        HashMap <Integer, List<Integer>> reverseHashMap =  new HashMap<>();

        for (int num : map.keySet()){
            int count = map.get(num);
            if (reverseHashMap.containsKey(count)){
                reverseHashMap.get(count).add(num);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(num);
                reverseHashMap.put(count,list);
            }
        }

        int index = 0;

        for(int i=nums.length; i>=0; i--){
            if(reverseHashMap.containsKey(i)){
                if (index == k) break;
                for (int val : reverseHashMap.get(i)){
                    System.out.print(reverseHashMap.get(i));
                    answer[index] = val;
                    index++;
                    
                }  
            }
        }

        return answer;
    }
}
