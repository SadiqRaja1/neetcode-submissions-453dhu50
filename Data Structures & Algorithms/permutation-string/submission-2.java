class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        int count = s1.length();
        int left = 0;

        for(int right=0; right<s2.length(); right++){
            char current = s2.charAt(right);
            if(map.containsKey(current)) {
                if(map.get(current) > 0){
                    count--;
                }
                map.put(current, map.get(current)-1);
            }

            int window = right-left+1;
            if(window > s1.length()) {
                if(map.containsKey(s2.charAt(left))) {
                    if(map.get(s2.charAt(left)) >= 0){
                        count++;
                    }
                    map.put(s2.charAt(left), map.get(s2.charAt(left))+1);
                } 
                left++;
            }

            if (count == 0) {
                return true;
            }
        }

        return false;
    }
}
