class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if(!stack.isEmpty() && isPair(stack.peek(), c)){
                stack.pop();
            }else {
                stack.push(c);
            }
            
        }

        return stack.isEmpty();
    }

    private boolean isPair(char open, char close){
        return (open == '(' && close == ')' ) ||
               (open == '[' && close == ']')  ||
               (open == '{' && close == '}');
    }
}
