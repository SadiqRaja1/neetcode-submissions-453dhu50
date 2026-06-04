class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int rightSmaller [] = new int [n];
        int leftSmaller [] = new int [n];
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            leftSmaller[i] = stack.isEmpty()? -1 : stack.peek();

            stack.push(i);
        }

        stack.clear();

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }

            rightSmaller[i] = stack.isEmpty()? n : stack.peek();

            stack.push(i);
        }

        for(int i=0; i<n; i++){
            ans = Math.max(ans, heights[i]*(rightSmaller[i] - leftSmaller[i]-1));
        }
    
        return ans;
    }
}
