class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = Arrays.stream(piles).max().getAsInt();
        int res = end;

        while(start <= end){
            int mid = start + (end - start)/2;

            long totalTime = 0;

            for(int pile : piles){
                totalTime += Math.ceil((double)pile/mid);
            }

            if(totalTime <= h){
                res = mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return res;
    }
}
