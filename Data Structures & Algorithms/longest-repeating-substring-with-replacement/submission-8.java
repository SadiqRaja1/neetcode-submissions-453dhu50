class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int mFreq = 0;
        int mWin = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int r = 0; r<s.length(); r++) {
            char charR = s.charAt(r);
            map.put(charR, map.getOrDefault(charR, 0)+1);
            mFreq = Math.max(mFreq, map.get(charR));
            int currWin = r-l+1;
            if(currWin - mFreq > k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }
            currWin = r-l+1;
            mWin = Math.max(mWin, currWin);
        }
        return mWin;
    }
}
