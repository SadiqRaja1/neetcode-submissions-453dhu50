class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap<>();
        for(String s : strs){
            char c [] = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if(!group.containsKey(sorted)) {
                group.put(sorted, new ArrayList<>());
            }
            group.get(sorted).add(s);
        }
        
        return new ArrayList<>(group.values());
    }
}
