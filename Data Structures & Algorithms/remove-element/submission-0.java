class Solution {
    public int removeElement(int[] nums, int val) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val) continue;
            q.offer(nums[i]);
        }
        int index = 0;
        for(int num : q){
            nums[index++]=num;
        }
        return q.size();
    }
}