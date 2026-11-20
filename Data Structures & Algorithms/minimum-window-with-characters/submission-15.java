class Solution {
    public String minWindow(String s, String t) {
        int l=0;
        int r=0;
        int count = t.length();
        int min = Integer.MAX_VALUE;
        String ans = "";
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char charT : t.toCharArray()) {
            freq.put(charT, freq.getOrDefault(charT, 0)+1);
        }
        while(r<s.length()) {
            char charR = s.charAt(r);
            if(freq.containsKey(charR)){
                if(freq.get(charR) >0){
                    count--;
                }
                freq.put(charR, freq.get(charR)-1);
            }
            while(count == 0){
                if(min > (r-l)+1){
                    ans = s.substring(l,r+1);
                    min = (r-l)+1;
                }
                char charL = s.charAt(l);
                if(freq.containsKey(charL)){
                    freq.put(charL, freq.get(charL)+1);
                    if(freq.get(charL) > 0) {
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
