class Employee{
    protected String name;
    protected int employeeID;
    protected double salary;

    public Employee(String name,int employeeID,double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.salary=salary;
    }

    public void displayDetails() {
        System.out.println("Name:" + name);
        System.out.println("Employee ID:" + employeeID);
        System.out.println("Salary:" + salary);

    }
}
class Manager extends Employee{
    private int teamSize;

    public Manager(String name,int employeeID,double salary,int teamSize){
        super(name,employeeID,salary);
        this.teamSize=teamSize;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size:"+teamSize);

    }
}

class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name,int employeeID,double salary,String programmingLanguage){
        super(name, employeeID, salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language:"+programmingLanguage);
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 80000.0, 5);
        Developer developer = new Developer("Bob", 102, 60000.0, "Java");
        manager.displayDetails();
        developer.displayDetails();
    }
}