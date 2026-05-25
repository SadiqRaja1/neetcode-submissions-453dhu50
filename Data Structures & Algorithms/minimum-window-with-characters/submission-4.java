class Solution {
    public String minWindow(String s, String t) {
        String answer = "";

        HashMap<Character, Integer> helper = new HashMap<>();

        for (char ch : t.toCharArray()) {
            helper.put(ch, helper.getOrDefault(ch, 0) + 1);
        }

        int minWin = 0;
        int left = 0;

        int count = t.length();

        for (int right = 0; right < s.length(); right++) {
            char currCh = s.charAt(right);

            // count update and hashmap check and update
            if (helper.containsKey(currCh)) {
                if (helper.get(currCh) > 0) {
                    count--;
                    helper.put(currCh, helper.get(currCh) - 1);
                } else {
                    helper.put(currCh, helper.get(currCh) - 1);
                }
            }

            while (count == 0) {
                if (minWin == 0 || minWin > (right - left) + 1) {
                    answer = s.substring(left, right + 1);
                    minWin = (right - left) + 1;
                }

                char lCh = s.charAt(left);
                if (helper.containsKey(lCh)) {
                    helper.put(lCh, helper.get(lCh) + 1);

                    if (helper.get(lCh) > 0) {
                        count++;
                    }
                }

                left++;
            }
        }

        return answer;
    }
}
