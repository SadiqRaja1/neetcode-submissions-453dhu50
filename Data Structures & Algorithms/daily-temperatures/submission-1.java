class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int answer [] = new int[n];

        Stack<int[]> st = new Stack<>();

        for(int i=0; i<n; i++){
            int c = temperatures[i];
            while(!st.isEmpty() && st.peek()[0] < c) {
                int pop [] = st.pop();
                answer[pop[1]] = i-pop[1];
            }
            int help [] = {c,i};
            st.push(help);
        }


        return answer;
    }
}
