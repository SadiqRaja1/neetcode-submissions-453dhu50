class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int l=0;
        int r=0;
        Map<Character, Integer> freq = new HashMap<>();
        int count = s1.length();
        int win = s1.length();
        for(char c : s1.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        while(r<s2.length()) {
            char curr = s2.charAt(r);
            if(freq.containsKey(curr)) {
                if(freq.get(curr) > 0){
                    count--;
                }
                freq.put(curr, freq.get(curr)-1);
            }
            if(count == 0) return true;
            if(r-l+1 == win){
                char currL = s2.charAt(l);
                if(freq.containsKey(currL)) {
                    if(freq.get(currL) >=0){
                        count++;
                    }
                    freq.put(currL, freq.get(currL)+1);
                }
                l++;
            }
            r++;
        }
        return false;
    }
}
