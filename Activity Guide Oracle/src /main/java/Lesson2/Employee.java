/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

/**
 *
 * @author Chrissie
 */
public class Employee {

        public int empl_id;
        public String empl_name;
        public String empl_ssn;
        private double salary;

    public Employee(){
        this.empl_id = empl_id;
        this.empl_name = empl_name;
        this.empl_ssn = empl_ssn;
        this.salary= salary;        
   
    }

    public int getEmpl_id() {
        return empl_id;
    }

    public void setEmpl_id(int empl_id) {
        this.empl_id = empl_id;
    }

    public String getEmpl_name() {
        return empl_name;
    }

    public void setEmpl_name(String empl_name) {
        this.empl_name = empl_name;
    }

    public String getEmpl_ssn() {
        return empl_ssn;
    }

    public void setEmpl_ssn(String empl_ssn) {
        this.empl_ssn = empl_ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
   
    
    
    
        
        
    
}
