package Collection.Map;

import java.util.Map;
import java.util.LinkedHashMap;

class LRUCache<K,V> extends LinkedHashMap<K,V>{
    private final int capacity;
    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size() > capacity;
    }
}
public class LinkedHashMapCollection {
    public static void main(String[] args) {
        LRUCache<String, Integer> student = new LRUCache<>(3);
       student.put("Karan",121);
        student.put("Shreya",123);
        student.put("Ankit",125);
        student.get("Karan");
        student.put("Ayan",543);
        System.out.println(student);

    }
}
