class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.replace(" ", "");
        s = s.toLowerCase();
        
        int n = s.length();
        System.out.println(s);

        for(int i=0, j =n-1; i<n && j>=0; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
