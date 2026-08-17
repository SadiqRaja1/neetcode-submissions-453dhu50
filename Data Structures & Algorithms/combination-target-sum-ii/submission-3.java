class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(ans, candidates, target, new ArrayList<>(), 0);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans, int [] arr, int target, List<Integer> curr, int start) {
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start; i<arr.length; i++){
            //Skiping duplicate
            if(i > start && arr[i] == arr[i-1]) {
                continue;
            }

            //stopping early if target become negative
            if(target - arr[i] < 0){
                break;
            }
            curr.add(arr[i]);
            backtrack(ans, arr, target-arr[i], curr, i+1);
            curr.remove(curr.size()-1);
        }
    }
}
