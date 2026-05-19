class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;
        int maxWindow = 0;

        for(int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);

            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));

            maxWindow = right - left +1;

            if(maxWindow - maxFreq > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) -1 );
                left++;
            }

            maxWindow = right - left +1;

            maxLength = Math.max(maxLength, maxWindow);
        }

        return maxLength;
    }
}
