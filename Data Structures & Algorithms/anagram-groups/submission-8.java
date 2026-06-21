class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String sortedS = new String(c);
            if(!map.containsKey(sortedS)){
                map.put(sortedS, new ArrayList<>());
            }
            map.get(sortedS).add(s);
        }


        return new ArrayList<>(map.values());
    }
}
