class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public void backtrack (List<List<Integer>> result, List<Integer> curr, int [] arr, int target, int start) {
        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i=start; i< arr.length; i++){
            //Skipping same
            if(i > start && arr[i] == arr[i-1]) {
                continue;
            }
            //Early termination if sum become negative
            if(target - arr[i] < 0){
                break;
            }
            curr.add(arr[i]);
            backtrack(result, curr, arr, target-arr[i], i+1);
            curr.remove(curr.size()-1);
        }
    }
}
