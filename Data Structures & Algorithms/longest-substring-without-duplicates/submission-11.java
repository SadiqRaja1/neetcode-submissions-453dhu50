class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> map = new HashSet<>();

        int l = 0;
        int max = 0;
        int maxWindow = 0;
        
        for(int r=0; r<n; r++){
            char cR = s.charAt(r);

            while(map.contains(cR)){
                map.remove(s.charAt(l));
                l++;
            }

            map.add(cR);

            maxWindow = Math.max(maxWindow, r-l+1);
        }
        return maxWindow;

    }
}
