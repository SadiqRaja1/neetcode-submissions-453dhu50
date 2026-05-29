class Solution {
    public int evalRPN(String[] tokens) {
        int  n = tokens.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){
            String curr = tokens[i];
            if(!curr.equals("*") && !curr.equals("/") && !curr.equals("+") && !curr.equals("-") ) {
                int help = Integer.parseInt(tokens[i]);
                st.push(help);
            }else{
                int b = st.pop();
                int a = st.pop();
                int res = 0;
                
                if(tokens[i].equals("*")) {
                    res = a * b;
                }
                if(tokens[i].equals("/")) {
                    res = a / b;
                }
                if(tokens[i].equals("+")) {
                    res = a + b;
                }
                if(tokens[i].equals("-")) {
                    res = a - b;
                }

                st.push(res);
            }
        }
        

        return st.peek();
    }
}
