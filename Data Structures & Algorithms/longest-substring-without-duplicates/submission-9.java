class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int count = 0;
        int max = 0;
        for(int r = 0; r<n; r++) {
            char c = s.charAt(r);
            if(!map.containsKey(c)) {
                count++;
            }else {
                l = Math.max(l, map.get(c)+1);
                count = 1;
            }
            max = Math.max(max, r-l+1);
            map.put(c, r);
        }

        return max;
    }
}
