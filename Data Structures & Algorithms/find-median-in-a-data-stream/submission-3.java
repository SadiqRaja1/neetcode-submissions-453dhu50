class MedianFinder {
    private Queue<Integer> minHeap;
    private Queue<Integer> maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>((a,b) -> b-a);
        maxHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        minHeap.offer(num);
        maxHeap.offer(minHeap.poll());
        if(minHeap.size() < maxHeap.size()) {
            minHeap.offer(maxHeap.poll());
        }
    }
    
    public double findMedian() {
        if(minHeap.size() > maxHeap.size()) {
            return minHeap.peek();
        }else {
            return (minHeap.peek()+maxHeap.peek())/2.0;
        }
    }
}
