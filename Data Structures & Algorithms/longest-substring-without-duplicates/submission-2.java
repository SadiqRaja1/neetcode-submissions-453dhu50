class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();

        int maxLen = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            if(seen.containsKey(s.charAt(right))) {
                left = Math.max(seen.get(s.charAt(right)) + 1, left);
            }
            seen.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, (right-left)+1);
        }

        return maxLen;
    }
}
