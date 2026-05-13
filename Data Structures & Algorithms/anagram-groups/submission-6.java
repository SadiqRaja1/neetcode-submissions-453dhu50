class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        int n = strs.length;

        for(String s : strs){
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedS = new String(ch);

            if(!map.containsKey(sortedS)) {
                map.put(sortedS, new ArrayList<>());
            }
            map.get(sortedS).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
