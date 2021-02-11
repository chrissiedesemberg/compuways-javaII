/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5.Lesson5_3;

/**
 *
 * @author Chrissie
 */
public enum Branch {
    LA("Basic"), BOSTON("Loan"), BANGALORE("Full"), MUMBAI("Full");
    String serviceLevel;
    private Branch(String serviceLevel){
    this.serviceLevel = serviceLevel;
    }
    public String getServiceLevel(){
    return serviceLevel;
}
}