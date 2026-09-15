package Lec10_Abstraction.EmploySalary;
public abstract class Employee {
    private String name;
    public Employee() {
        this.name = name;
    }
    public void Employee(){
        
    }
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }
    public void displayinfo(){
        System.out.println("Name : " + getName());
    }
    abstract double CalculateSalary();
}
