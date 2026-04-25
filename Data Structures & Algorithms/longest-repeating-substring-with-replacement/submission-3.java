class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character, Integer> count = new HashMap<>();
        int maxFreq = 0;
        int maxLength = 0;
        int left = 0;

        for(int right=0; right<n; right++){
            count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0)+1);

            maxFreq = Math.max(maxFreq, count.get(s.charAt(right)));

            int maxWindow = right-left+1;

            if(maxWindow-maxFreq > k){
                count.put(s.charAt(left), count.get(s.charAt(left))-1);
                left++;  
            }
            maxWindow = right-left+1;

            maxLength = Math.max(maxLength, maxWindow);
        }
        return maxLength;
    }
}
