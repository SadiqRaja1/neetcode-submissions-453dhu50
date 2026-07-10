class LRUCache {

     class Node{
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int val){
            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);

    int limit = 0;
    Map<Integer, Node> m;

    void addNode(Node add) {
        Node oldNext = head.next;

        head.next = add;
        oldNext.prev = add;

        add.prev = head;
        add.next = oldNext;
    }

    void delNode(Node del){
        Node oldNext = del.next;
        Node oldPrev = del.prev;

        oldPrev.next = oldNext;
        oldNext.prev = oldPrev;
    }

    public LRUCache(int capacity) {
        limit = capacity;
        m = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!m.containsKey(key)) return -1;
        Node ansNode = m.get(key);
        int ans = ansNode.val;
        m.remove(key);
        delNode(ansNode);
        addNode(ansNode);
        m.put(key, ansNode);
        
        return ans;
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)) {
            Node oldNode = m.get(key);
            delNode(oldNode);
            m.remove(key);
        }
        
        if(m.size() == limit){
            Node leastRecentNode = tail.prev;
            int oldKey = leastRecentNode.key;
            delNode(leastRecentNode);
            m.remove(oldKey);
        }

        Node newNode = new Node(key, value);
        addNode(newNode);
        m.put(key, newNode);
    }
}
