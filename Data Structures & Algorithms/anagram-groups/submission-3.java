class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> reference = new HashMap<>();

        for(String s : strs) {
            char ch [] = s.toCharArray();
            Arrays.sort(ch);
            String check = new String(ch);
            if(reference.containsKey(check)) {
                reference.get(check).add(s);
            }else{
                List<String> st = new ArrayList<>();
                st.add(s);
                reference.put(check, st);
            }
        }

        return new ArrayList<>(reference.values());
    }
}
