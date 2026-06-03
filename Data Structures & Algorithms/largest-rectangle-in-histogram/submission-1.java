class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int ans = 0;
        int rightSmaller [] = new int[n];
        int leftSmaller [] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1; i>=0; i--){
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i] ){
                stack.pop();
            }

            if(!stack.isEmpty()) {
                rightSmaller[i] = stack.peek();
            }else{
                rightSmaller[i] = n;
            }
            stack.push(i);
        }

        stack.clear();

        for(int i=0; i<n; i++){
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i] ){
                stack.pop();
            }

            if(!stack.isEmpty()) {
                leftSmaller[i] = stack.peek();
            }else{
                leftSmaller[i] = -1;
            }
            stack.push(i);
        }

        for(int i =0; i<n; i++) {
            ans = Math.max(ans, heights[i] * (rightSmaller[i] - leftSmaller[i]-1));
        }

        return ans;
    }
}
