import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListToArray {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        System.out.println("Linked List: " + numbers);
        
        Integer[] numArray = numbers.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(numArray));
    }
}