class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while(end < s.length()) {
            while(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            max = Math.max(max, end-start+1);
            set.add(s.charAt(end));
            end++;
        }
        return max;
    }
}
