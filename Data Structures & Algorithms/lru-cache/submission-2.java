class LRUCache {

    class Node {
        int key;
        int val;
        Node next;
        Node prev;

        Node (int key, int val){
            this.key = key;
            this.val = val;
            next = null;
            prev = null;
        }
    }

    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);

    int limit = 0;
    Map<Integer, Node> m;

    void addNode(Node add) {
        Node next = head.next;

        head.next = add;
        add.next = next;
        next.prev = add;
        add.prev = head;
    }

    void delNode(Node del){
        Node oldNext = del.next;
        Node oldPrev = del.prev;

        oldNext.prev = oldPrev;
        oldPrev.next = oldNext;
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

        delNode(ansNode);
        m.remove(key);
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
            Node LRUNode = tail.prev;
            delNode(LRUNode);
            m.remove(LRUNode.key);
        }

        Node newNode = new Node(key,value);
        addNode(newNode);
        m.put(key,newNode);
    }
}
