class MedianFinder {

    private Queue<Integer> smallHeap;
    private Queue<Integer> largeHeap;

    public MedianFinder() {
        smallHeap = new PriorityQueue<>((a,b) -> b-a);
        largeHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        smallHeap.offer(num);
        largeHeap.offer(smallHeap.poll());
        if(smallHeap.size() < largeHeap.size()) {
            smallHeap.offer(largeHeap.poll());
        }
    }
    
    public double findMedian() {
        if(smallHeap.size() > largeHeap.size()) {
            return smallHeap.peek();
        }else {
            return (smallHeap.peek() + largeHeap.peek()) / 2.0;
        }
    }
}
