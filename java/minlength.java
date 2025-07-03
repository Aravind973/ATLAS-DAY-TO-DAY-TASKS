import java.util.*;

public class minlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array1 size");
        int arraysize_a1 = sc.nextInt();
        sc.nextLine();
        String[] a1 = new String[arraysize_a1];
        System.out.println("Enter array1 elements");
        for (int i = 0; i < arraysize_a1; i++) {
            a1[i] = sc.nextLine();
        }

        System.out.println("Enter array2 size");
        int arraysize_a2 = sc.nextInt();
        sc.nextLine();
        String[] a2 = new String[arraysize_a2];
        System.out.println("Enter array2 elements");
        for (int i = 0; i < arraysize_a2; i++) {
            a2[i] = sc.nextLine();
        }

        System.out.println("input 1: " + Arrays.toString(a1));
        System.out.println("input 2: " + Arrays.toString(a2));

        String[] a3 = new String[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            a3[i + a1.length] = a2[i];
        }
        System.out.println("input 3: " + Arrays.toString(a3));

        String short_length = a3[0];
        int sindex = 0;
        for (int i = 0; i < a3.length; i++) {
            if (a3[i].length() > short_length.length()) {
                short_length = a3[i];
                sindex = i;
            }
        }

        System.out.println("shortest word is: " + short_length);
        System.out.println("shortest word index is: " + sindex);
        sc.close();
    }
}
