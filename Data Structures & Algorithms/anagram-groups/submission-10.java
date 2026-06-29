class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int helper [] = new int[26];
            for(char c : s.toCharArray()){
                helper[c - 'a']++;
            }
            String key = Arrays.toString(helper);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        };

        return new ArrayList<>(map.values());
    }
}
