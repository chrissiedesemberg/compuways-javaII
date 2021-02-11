/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3;

import java.text.NumberFormat;

/**
 *
 * @author Chrissie
 */

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary ) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary= salary;        
   
    }

     public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
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

    public int getEmpId() {
        return empId;
    }
    
    
    public void changeName(String newName) {
          if (newName != null) {
              this.name = newName;
          }
     }
 
     public void raiseSalary(double increase) {
         this.salary += increase;
     }
     
     public void printEmployee() {
         System.out.println("");
         System.out.println(
                "\nEmployee name: " +  getName() + 
                "\nSocial Security Number: " + getSsn() + 
                "\nSalary: " + NumberFormat.getCurrencyInstance().format((double)getSalary()));
     }
 }



