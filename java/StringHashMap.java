import java.util.HashMap;
import java.util.Map;

public class StringHashMap {
    public static void main(String[] args) {
       
        Map<String, String> map = new HashMap<>();


        map.put("Fruit1", "Apple");
        map.put("Fruit2", "Banana");
        map.put("Fruit3", "Cherry");
        map.put("AnotherKey", "Date");
        map.put("MyFavorite", "Elderberry");

        System.out.println("Contents of the HashMap with String keys and values:");
        
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key = \"" + entry.getKey() + "\", Value = \"" + entry.getValue() + "\"");
        }
    }
}