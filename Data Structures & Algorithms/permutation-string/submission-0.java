class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char s1Arr [] = s1.toCharArray();
        Arrays.sort(s1Arr);
        String s1Sorted = new String(s1Arr);

        for(int i=0; i<s2.length(); i++){
            for(int j=i; j<s2.length(); j++){
                String sub = new String(s2.substring(i, j+1));
                char subArr [] = sub.toCharArray();
                Arrays.sort(subArr);

                String subSorted = new String(subArr);

                if(subSorted.equals(s1Sorted)) {
                    return true;
                }
            }
        }

        return false;
    }
}
