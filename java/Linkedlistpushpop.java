import java.util.LinkedList;

public class Linkedlistpushpop {
    public static void main(String[] args) {
 
        LinkedList<String> stack = new LinkedList<>();
        
       
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        
        
        System.out.println("Stack after pushes: " + stack);
        
       
        System.out.println("\nPopping elements:");
        while (!stack.isEmpty()) {
            String top = stack.pop(); 
            System.out.println("Popped: " + top + " | Remaining: " + stack);
        }
    }
}