package OOPs.Encapsulation;

public class BankEmployee {
    String name;
    int empId;
    String department;
    int salary;

    public BankEmployee(String name,int empid,String department,int salary) {
        this.name = name; // this keyword refers to the current of instance variables
        this.empId =empid;
        this.department = department;
        this.salary = salary;
    }
    public void EmployeesDetails() {
        System.out.println("the employee details are: ");
        System.out.println("name " + this.name);
        System.out.println("empid "+ this.empId);
        System.out.println("department "+this.department);
        System.out.println("salary "+ this.salary);
    }
    }
    class Test {
        public static void main(String[] args) {
            BankEmployee e1 = new BankEmployee("daniyal",72,"accounts",35000);
            BankEmployee e2 = new BankEmployee("syed",61,"Accounts",30000);
        e1.EmployeesDetails();
        e2.EmployeesDetails();
        }

}
