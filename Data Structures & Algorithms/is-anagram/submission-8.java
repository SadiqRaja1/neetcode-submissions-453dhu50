class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> count = new HashMap<>();

        for(char ch : s.toCharArray()){
            count.put(ch, count.getOrDefault(ch,0)+1);
        }

        for(char ch : t.toCharArray()) {
            if(!count.containsKey(ch)) {
                return false;
            }
            count.put(ch, count.get(ch)-1);
        }

        for (int check : count.values()){
            if(check != 0){
                return false;
            }
        }

        return true;

    }
}
