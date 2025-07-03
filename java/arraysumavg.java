import java.util.Scanner;

public class arraysumavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int arraysize = sc.nextInt();
        int[] a = new int[arraysize];

        System.out.println("Enter array elements");
        int sum = 0;
        for (int i = 0; i < arraysize; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println("sum : " + sum);
        System.out.println("avg : " + (sum / a.length));

        sc.close();
    }
}
