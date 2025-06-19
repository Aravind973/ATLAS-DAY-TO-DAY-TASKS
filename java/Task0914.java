class Person {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee Name: " + name + ", Employee ID: " + id;
    }
}

class Employee extends Person {
    private String department;
    private double salary;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String dept) {
        this.department = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Salary: ₹" + salary;
    }
}

class Manager extends Employee {
    private int teamSize;
    private String level;

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int size) {
        this.teamSize = size;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String lvl) {
        this.level = lvl;
    }

    @Override
    public String toString() {
        return super.toString() + ", Team Size: " + teamSize + ", Manager Level: " + level;
    }
}

public class Task0914 {  // Change class declaration to match file name
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.setName("Aravind");
        manager.setId(2345);
        manager.setDepartment("SDE");
        manager.setSalary(950000.75);
        manager.setTeamSize(7);
        manager.setLevel("Lead");

        System.out.println(manager.toString());
    }
}
