class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                st.push(c);
            }else {
                if(st.isEmpty()) {
                    return false;
                }

                if(check (st.peek(), c )){
                    st.pop();
                }else{
                    return false;
                }
            }
        }

        if(st.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    private boolean check(char l, char r){
        if( l == '(' && r == ')' || l == '[' && r == ']' || l == '{' && r == '}'){
            return true;
        }
        return false;
    }
}
