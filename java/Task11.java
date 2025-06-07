import java.util.*;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = "Aravind";
        String pwd = "7777";      // match the literal used in the loop
        int count = 0;

        while (loginid.equals("Aravind") && pwd.equals("7777")) {
            System.out.println("you have logged in for " + count++ + " times");
            System.out.println("Enter your loginid");
            loginid = sc.nextLine();
            System.out.println("Enter your password");
            pwd = sc.nextLine();
        }
        sc.close();
    }
}






