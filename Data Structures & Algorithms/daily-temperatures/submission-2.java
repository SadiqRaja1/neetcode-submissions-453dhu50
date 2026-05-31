class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> st = new Stack<>();
        int n = temperatures.length;
        int ans[] =  new int [n];

        for(int i=0; i<n; i++) {
            while(!st.isEmpty() && st.peek()[0] < temperatures[i]){
                int curr [] = st.pop();
                ans[curr[1]] = i - curr[1];
            }
            int helper [] = {temperatures[i], i};
            st.push(helper);
        }

        return ans;
    }
}
