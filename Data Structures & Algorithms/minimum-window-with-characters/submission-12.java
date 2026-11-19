class Solution {
    public String minWindow(String s, String t) {
        int l=0;
        int r=0;
        int count = t.length();
        HashMap<Character, Integer> freq = new HashMap<>();
        int min = Integer.MAX_VALUE;
        String ans = "";
        for(char charT : t.toCharArray()){
            freq.put(charT, freq.getOrDefault(charT, 0)+1);
        }
        while(r < s.length()) {
            char currR = s.charAt(r);
            if(freq.containsKey(currR)){
                if(freq.get(currR) > 0){
                    count--;
                }
                freq.put(currR, freq.get(currR)-1);
            }
            while(count == 0){
                if(min > (r - l)+1){
                    ans = s.substring(l, r+1);
                    min = (r-l)+1;
                }
                char currL = s.charAt(l);
                if(freq.containsKey(currL)) {
                    freq.put(currL, freq.get(currL)+1);
                    if(freq.get(currL) > 0) {
                        count++;
                    }
                }
                l++;
            }
            r++;
        }
        return ans;
    }
}
