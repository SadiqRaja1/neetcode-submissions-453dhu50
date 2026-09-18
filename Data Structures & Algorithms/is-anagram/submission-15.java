class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> check = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            check.put(s.charAt(i), check.getOrDefault(s.charAt(i), 0)+1);
            check.put(t.charAt(i), check.getOrDefault(t.charAt(i), 0)-1);
        }
        for(char c : check.keySet()) {
            if(check.get(c) != 0) return false;
        }
        return true;
    }
}
