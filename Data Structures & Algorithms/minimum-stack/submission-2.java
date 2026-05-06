class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minSt;

    public MinStack() {
        stack = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int top = stack.pop();
        if(top == minSt.peek()) {
            minSt.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
