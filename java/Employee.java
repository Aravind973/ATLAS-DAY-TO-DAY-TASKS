class Employee {
    private int pwd;
    protected int Salary;
    public int empid;

    Employee() {
        
    }
}

class Hr extends Employee {
    Hr() {
        // super.pwd = 777; // Error: Cannot access private member of superclass
        super.Salary = 777777; // OK: Salary is protected
        super.empid = 7777;  // OK: empid is public
    }

    public static void main(String[] args) {
        Hr hr = new Hr();
        
        System.out.println("Salary: " + hr.Salary);
        System.out.println("EmpID: " + hr.empid);
    }
}


    
