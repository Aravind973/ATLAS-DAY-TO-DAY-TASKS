import java.util.LinkedList;

public class linkedlistremove {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Zebra");
        
        System.out.println("Original List: " + animals);
        
        animals.remove("Elephant");
        
        System.out.println("After Removal: " + animals);
    }
}