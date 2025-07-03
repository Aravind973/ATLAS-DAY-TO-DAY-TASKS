import java.util.LinkedList;

public class linkedlistreplace {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Fig");
        
        System.out.println("Original List: " + list);
        
        list.set(2, "Mango");
        
        System.out.println("Modified List: " + list);
    }
}