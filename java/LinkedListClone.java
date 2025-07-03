import java.util.LinkedList;

public class LinkedListClone {
    public static void main(String[] args) {
        
        LinkedList<String> originalList = new LinkedList<>();
        
        
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Date");
        
        System.out.println("Original List: " + originalList);
        
     
        LinkedList<String> clonedList = (LinkedList<String>) originalList.clone();
        
        System.out.println("Cloned List: " + clonedList);
        
        originalList.add("Fig");
        originalList.removeFirst();
        
        System.out.println("\nAfter modifying original list:");
        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List: " + clonedList);
    }
}