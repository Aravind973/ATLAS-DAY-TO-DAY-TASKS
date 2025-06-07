public class Task4 {

    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
        
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {

        
        System.out.println("main started");
        int a=7;
        int b=9;

        System.out.println("sum of two numbers is :"+add(a,b));
        System.out.println("diff of two numbers is :"+sub(a,b));
        System.out.println("product of two numbers is :"+mul(a,b));
        System.out.println("division of two numbers is :"+div(a,b));

        System.out.println("main ended");
    }

}
