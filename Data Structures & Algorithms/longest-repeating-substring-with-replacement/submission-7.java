class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0;
        int maxWindow = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int r = 0; r<n; r++) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c,0)+1);

            int currFreq = map.get(c);

            max = Math.max(max, currFreq);

            int currWindow = r-l+1;

            if(currWindow - max > k) {
                char cl = s.charAt(l);
                map.put(cl, map.get(cl)-1);
                l++;
                currWindow = r-l+1;
            }

            maxWindow = Math.max(maxWindow, currWindow);
        }
        return maxWindow;
    }
}
