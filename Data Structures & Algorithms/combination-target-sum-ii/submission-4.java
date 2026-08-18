class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, ans, new ArrayList<>(), 0);
        return ans;
    }

    public void backtrack(int []arr, int target, List<List<Integer>> ans, List<Integer> curr, int start) {
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start; i<arr.length; i++){
            if(target-arr[i] < 0){
                break;
            }
            if(i > start && arr[i] == arr[i-1]){
                continue;
            }
            curr.add(arr[i]);
            backtrack(arr, target-arr[i], ans, curr, i+1);
            curr.remove(curr.size()-1);
        }
    }
}
