package Lesson6.Lesson6_2;

public abstract class Account {
    
    protected double balance;
    
    public Account(double balance) {
        this.balance = balance;
    }
   
    
    @Override
    public String toString() {
        return "Current balance is " + balance;
    }
    
//    @Override
//    
//    public double getBalance() {
//        return balance;
//    }
//    
//    public void deposit(double amount) {
//        balance += amount;
//    }
//    public abstract boolean withdraw(double amount);
//    
//    public abstract String getDescription();
    
}