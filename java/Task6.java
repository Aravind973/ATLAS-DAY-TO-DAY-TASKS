import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID");
        String id = sc.nextLine();
        System.out.println("Enter your pwd");
        String pwd = sc.nextLine();
        StringBuilder masked = new StringBuilder();
        for (int i = 0; i < pwd.length(); i++) {
            masked.append('*');
        }

        System.out.println("Hi");
        System.out.println("your login is : " + id);
        System.out.println("your pwd is : " + masked);
        sc.close();
    }
}
