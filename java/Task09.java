import java.util.*;
public class Task09 {
    
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        System.out.println("Enter c value");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is Greater than b and c");
        }else if(b>a&& b>c){
            System.out.println("B is greater than a and c");
        }else{
            System.out.println("c is greater");
        }
        sc.close();

    }
} 
