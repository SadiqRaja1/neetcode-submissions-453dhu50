class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        int res = end;

        while(start <= end){
            int k = start + (end - start)/2;
            long totalTime = 0;

            for(int pile : piles){
                totalTime += Math.ceil((double) pile/k);
            }

            if(totalTime <= h){
                res = k;
                end = k - 1;
            }else {
                start = k + 1;
            }
        }

        return res;
    }
}
