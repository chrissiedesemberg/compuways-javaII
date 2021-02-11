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
public class Director extends Manager {
     
    private double budget;

    public double getBudget() {
        return budget;
    }
    
    public Director(double budget, String deptName, int empId, String name, String ssn, double salary) {
        super(deptName, empId, name, ssn, salary);
        this.budget = budget;
    }
}
