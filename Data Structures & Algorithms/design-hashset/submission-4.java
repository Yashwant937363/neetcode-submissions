class MyHashSet {
    private LinkedList<Integer>[] buckets;
    int size = 1000;
    public MyHashSet() {
        buckets = (LinkedList<Integer>[]) new LinkedList[size];
        for(int i = 0; i < size; i++){
            buckets[i] = new LinkedList<Integer>();
        }
    }

    public int hashFunction(int key){
        return key % size ;
    }
    
    public void add(int key) {
        int hashKey = hashFunction(key);
        if(!this.contains(key)){
            buckets[hashKey].add(key);
        }
    }
    
    public void remove(int key) {
        int hashKey = hashFunction(key);
        int index = buckets[hashKey].indexOf(key);
        if(index != -1){
            buckets[hashKey].remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        int hashKey = hashFunction(key);
        return buckets[hashKey].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */