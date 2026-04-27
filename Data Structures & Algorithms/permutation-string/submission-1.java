class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        HashMap<Character, Integer> need = new HashMap<>();

        for(char ch : s1.toCharArray()){
            need.put(ch, need.getOrDefault(ch,0)+1);
        }

        int left = 0;
        int count = s1.length();

        for(int right = 0; right < s2.length(); right++){
            char rightChar = s2.charAt(right);

            if(need.containsKey(rightChar)) {
                if(need.get(rightChar) > 0) {
                    count--;
                } 
                need.put(rightChar, need.get(rightChar)-1);
            }

            if(right-left+1 > s1.length()){
                char leftChar = s2.charAt(left);

                if(need.containsKey(leftChar)) {
                    if(need.get(leftChar) >= 0){
                        count++;
                    }
                    need.put(leftChar, need.get(leftChar) +1);
                }

                left++;
            }

            if(count == 0){
                return true;
            }
        }

        return false;
    }
}
