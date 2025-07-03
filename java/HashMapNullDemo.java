import java.util.HashMap;

public class HashMapNullDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put(null, 1);
        System.out.println("After first null key: " + map);
        
        map.put(null, 2);
        System.out.println("After second null key: " + map);
        
        map.put("apple", 3);
        map.put("banana", 4);
        
        System.out.println("Final map: " + map);
        System.out.println("Value for null key: " + map.get(null));
    }
}