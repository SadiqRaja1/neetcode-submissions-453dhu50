class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();

        int left = 0;

        int maxWindow = 0;
        int maxFreq = 0;

        for(int right = 0; right<s.length(); right++){
            count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0)+1);

            maxFreq = Math.max(count.get(s.charAt(right)), maxFreq);

            int windowLength = right - left + 1;

            if(windowLength - maxFreq > k) {
                count.put(s.charAt(left), count.get(s.charAt(left))-1);
                left++;
            }

            windowLength = right - left + 1;
            
            maxWindow = Math.max(maxWindow, windowLength);
        }

        return maxWindow;
    }
}
