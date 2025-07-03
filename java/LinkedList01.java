import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.addFirst("Orange");
        fruits.addLast("Grapes");

        System.out.println("First Element: " + fruits.getFirst());
        System.out.println("Last Element: " + fruits.getLast());

        fruits.removeFirst();
        fruits.removeLast();

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        System.out.println("\nFinal list size: " + fruits.size());
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));
    }
}