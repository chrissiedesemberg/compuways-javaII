/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4.Lesson4_1;

/**
 *
 * @author Chrissie
 */
public class EmployerStockPlan {
    
    private final int employeeShares = 10;
    private final int managerShares = 100;
    private final int directorShares = 1000;
    
    public int grantStock(Employee e){
    if (e instanceof Director) {
    return directorShares;
    }
    else if (e instanceof Manager) {
    return managerShares;
    }
    else {
    return employeeShares;
    } 
        }
}
