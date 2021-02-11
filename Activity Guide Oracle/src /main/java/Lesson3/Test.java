/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3;

/**
 *
 * @author Chrissie
 */
public class Test {
    public static void main(String[] args) {
       
        //Employee
        Employee emp = new Employee(101, "Jane Smith", "012-34-5678", 120_345.27 );
        emp.raiseSalary(2000);
        emp.changeName("Jane Williams");
        emp.printEmployee();
    
        //Manager
        Manager mgr = new Manager("US Marketing", 207, "Barbara Johnson", "054-12-2367", 109_501.36);
        mgr.printEmployee();
        
        //Admin
        Admin adm = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
        adm.printEmployee();
        
        //Director
        Director dir = new Director(1_000_000.00, "Global Marketing", 12, "Susan Wheeler", "099-45-2340", 120_567.36 );
        dir.printEmployee();
        
    }
}