import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = "ARAVIND";
        String pwd = "7777";
        int count = 0;
        String login, password;

        do {
            System.out.println("Enter your login_id");
            login = sc.nextLine();
            System.out.println("Enter your password");
            password = sc.nextLine();
            count++;

            if (!login.equals(id) || !password.equals(pwd)) {
                System.out.println("Entered details are incorrect, kindly try again!");
            }
        } while (!login.equals(id) || !password.equals(pwd));

        System.out.println("You have successfully logged into your account after: " + count + " attempts. Thank you");
        sc.close();
    }
}
