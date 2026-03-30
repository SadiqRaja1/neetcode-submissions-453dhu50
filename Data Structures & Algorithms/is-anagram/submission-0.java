class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char aHelper [] = s.toCharArray();
        char bHelper [] = t.toCharArray();

        Arrays.sort(aHelper);
        Arrays.sort(bHelper);


        if(Arrays.equals(aHelper, bHelper)) {
            return true;
        }

        return false;
    }
}
