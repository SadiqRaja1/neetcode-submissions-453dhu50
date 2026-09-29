class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> ans = new HashMap<>();
        for(String s : strs){
            char ch [] = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!ans.containsKey(sorted)){
                ans.put(sorted, new ArrayList<>());
            }
            ans.get(sorted).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
