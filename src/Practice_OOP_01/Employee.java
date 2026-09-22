package Practice_OOP_01;

public class Employee {
    private double salary;
    private String name;
    public Employee() {
        System.out.println("Employee Created Successfully");
    }
    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    void setName(String name){
        this.name = name;
        System.out.println("Name is successfully Setted");
    }
    void setSalary(double salary){
        if (salary>0){
            this.salary = salary;
            System.out.println("Salary is successfully Setted");
        }
        else{
            System.out.println("Your Salary Must be Greater than 0");
        }
    }
    String getName(){
        System.out.println("Here is Employee Name :- "+ name);
        return name;
    }
}
