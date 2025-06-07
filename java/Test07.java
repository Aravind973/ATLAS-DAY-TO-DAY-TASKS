class Customer {
    void accept() {
        System.out.println("accept customer called");
    }

    void display() {
        System.out.println("display customer called");
    }
}

public class Test007 { // This class has the main method
    public static void main(String[] args) {
        Customer cobj = new Customer();
        cobj.accept();
        cobj.display();
    }
}

