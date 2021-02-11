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
public class ManagerTest {
    public static void main(String[] args) {
        
        Manager man1 = new Manager("Shopfloor", 102, "John Smith", "123456", 10200.00);
        System.out.println(
                "Department: " + man1.getDeptName() + 
                "\nEmployee name: " +  man1.getName() + 
                "\nSocial Security Number: " + man1.getSsn() + 
                "\nSalary: " + man1.getSalary());
        
    }
    
}
