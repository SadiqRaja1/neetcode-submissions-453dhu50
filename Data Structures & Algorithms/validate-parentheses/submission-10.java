class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty() && isPair(stack.peek(), ch)){
                stack.pop();
            }else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }

    private boolean isPair (char open, char close){
        return  (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
