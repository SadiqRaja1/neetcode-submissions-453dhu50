class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int max = 0;
        int maxCount = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        while(r<s.length()) {
            freq.put(s.charAt(r), freq.getOrDefault(s.charAt(r),0)+1);
            for(int i: freq.values()){
                max = Math.max(max , i);
            }
            if((r-l+1)-max > k){
                freq.put(s.charAt(l), freq.get(s.charAt(l))-1);
                l++;
            }else{
                maxCount = Math.max(maxCount, r-l+1);
            }
            r++;
        }
        return maxCount;
    }
}
