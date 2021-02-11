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
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        
        employee1.setEmpl_id(101);
        employee1.setEmpl_name("Jane");
        employee1.setEmpl_ssn("012-34-5678");
        employee1.setSalary(120_345.27);
        
        System.out.println(employee1.getEmpl_name());
    }
}
