package PracticeQ1.Q3;

class Employee{
    protected String Name;
    protected double salary;

    public Employee(String name, double salary) {
        Name = name;
        this.salary = salary;
    }
    public String getName() {
        return Name;
    }

    public double getSalary() {
        return salary;
    }

    public void displayInfo(){
        System.out.println("Employee Name : (Mr/Ms)"+ getName());
        System.out.println("Employee's Salary : ($)"+ getSalary());
    }
}

class ParttimeEmployee extends Employee{
    protected int OTHrs;

    public ParttimeEmployee(String name, double salary, int OTHrs) {
        super(name, salary);
        this.OTHrs = OTHrs;
    }

    public void displayEmpInfo(){
        super.displayInfo();
        System.out.println("employee's OThours  : " + this.OTHrs);
    }
}


class EmpApp{
    public static void main(String[] args) {
        ParttimeEmployee emp1 = new ParttimeEmployee("Alice", 20000.00, 7);
        ParttimeEmployee emp2 = new ParttimeEmployee("Bob", 30000.00, 4);

        emp1.displayEmpInfo();
        System.out.println();
        emp2.displayEmpInfo();
    }
}