import java.util.Hashtable;
import java.util.Map;

public class Hash{
    public static void main(String[] args) {
        
        Hashtable<Integer, String> table = new Hashtable<>();

        
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");
        table.put(4, "Date");
        table.put(5, "Elderberry");

        
        System.out.println("Contents of the hash table:");
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
