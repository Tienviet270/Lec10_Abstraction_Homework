package Lec10_Abstraction.EmploySalary;
import Lec10_Abstraction.EmploySalary.Employee;
import java.util.*;
public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee() {
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public double CalculateSalary(){
        return getSalary();
    }
    
}
