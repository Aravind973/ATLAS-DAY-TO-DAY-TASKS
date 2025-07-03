import java.util.LinkedList;

public class linkedlistdisplay {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");
        
        System.out.println("Display using for-loop with get():");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Element at index " + i + ": " + fruits.get(i));
        }
        
        System.out.println("\nDisplay using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}