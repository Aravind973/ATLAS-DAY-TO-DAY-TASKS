import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorExample {
    public static void main(String[] args) {
      
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

       
        ListIterator<String> iterator = fruits.listIterator();

        System.out.println("Iterating forward:");
        while (iterator.hasNext()) {
            String fruit = iterator.next(); 
            System.out.println(fruit);
        }

        System.out.println("\nIterating backward:");
        while (iterator.hasPrevious()) {
            String fruit = iterator.previous(); 
            System.out.println(fruit);
        }
    }
}