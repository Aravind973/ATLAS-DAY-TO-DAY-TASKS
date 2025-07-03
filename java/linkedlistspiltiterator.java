import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Spliterator;
import java.util.List;

public class linkedlistspiltiterator {
    public static void main(String[] args) {
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Date");
        originalList.add("Fig");
        originalList.add("Grape");

        System.out.println("Original List: " + originalList);
        
        Spliterator<String> split1 = originalList.spliterator();
        Spliterator<String> split2 = split1.trySplit();
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        split1.forEachRemaining(list1::add);
        split2.forEachRemaining(list2::add);
        
        System.out.println("\nFirst Split List:  " + list1);
        System.out.println("Second Split List: " + list2);
    }
}