class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int l=0;
        int r=0;
        Map<Character, Integer> freq = new HashMap<>();
        int count = s1.length();
        for(char c : s1.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        while(r<s2.length()) {
            char curr = s2.charAt(r);
            if(freq.containsKey(curr) && freq.get(curr) <=0){
                while(freq.get(curr) <=0 && l<=r){
                    char currL = s2.charAt(l);
                    if(freq.containsKey(currL)){
                        freq.put(currL, freq.get(currL)+1);
                        count++;
                    }
                    l++;
                }
                freq.put(curr, freq.get(curr)-1);
                count--;
                if(count == 0)return true;
            }else if(freq.containsKey(curr)) {
                freq.put(curr, freq.get(curr)-1);
                count--;
                if(count == 0)return true;
            }else{
                while(l<r){
                    char currL = s2.charAt(l);
                    if(freq.containsKey(currL)){
                        freq.put(currL, freq.get(currL)+1);
                        count++;
                    }
                    l++;
                }
            }
            r++;
        }
        return false;
    }
}
