// File: AbstractDemo.java

public class AbstractDemo {
    public static void main(String[] args) {
        Employee e = new SalariedEmployee("George W.", "Houston, TX", 43, 5000.00);

        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
    }
}

abstract class Employee {
    private final String name;
    private final String address;
    private final int id;

    public Employee(String name, String address, int id) {
        System.out.println("Constructing an Employee");
        this.name    = name;
        this.address = address;
        this.id      = id;
    }

    public abstract double computePay();

    public void mailCheck() {
        System.out.println("Mailing check to salaried employee: " + name);
        System.out.println("Monthly Pay: $" + computePay());
    }
}

class SalariedEmployee extends Employee {
    private final double salary;

    public SalariedEmployee(String name, String address, int id, double salary) {
        super(name, address, id);
        this.salary = salary;
    }

    @Override
    public double computePay() {
        return salary / 12;
    }
}
