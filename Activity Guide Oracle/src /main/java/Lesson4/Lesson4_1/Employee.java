package lesson4.Lesson4_1;

import java.text.NumberFormat;
import lesson4.Lesson4_1.EmployerStockPlan;

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        // Make sure the name value is not null or empty
        if (name != null && !name.equals("")) {
            this.name = name;
        }
    }

    public void raiseSalary(double increase) {
        // Make sure the increase is not less than 0
        if (increase > 0) {
            salary += increase;

        }
    }
    
    public String toString(){
        return "\nEmployee id:" + getEmpId() + 
                "\nEmployee name: " + getName() + 
                "\nEmployee SSN:" + getSsn() + 
                "\nEmployee salary:" + NumberFormat.getCurrencyInstance().format((double) getSalary());}
    
    
}
