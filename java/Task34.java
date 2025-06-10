public class Task34 {
    public static void add(int x, int y) {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void add(int x, int y, int z) {
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }

    public static void main(String[] args) {
        add(10, 20, 30);
        add(50, 100);
    }
}
