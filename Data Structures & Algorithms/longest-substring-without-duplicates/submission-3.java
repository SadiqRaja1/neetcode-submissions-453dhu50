class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;

        for(int right=0; right<n; right++){

            if(map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            max = Math.max(max, (right-left)+1);
        }

        return max;
    }
}
