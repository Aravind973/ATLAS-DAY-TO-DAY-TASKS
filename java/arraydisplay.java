import java.util.ArrayList;

public class arraydisplay {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i); 
        }

        // Displaying elements
        System.out.println("ArrayList Elements:");
        for (int num : list) {
            System.out.println(num);
        }
    }
}
