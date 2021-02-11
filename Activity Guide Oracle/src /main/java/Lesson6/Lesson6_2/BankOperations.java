package Lesson6.Lesson6_2;

public interface BankOperations {
   public void addCustomer(String f, String l,Branch b);
   public int getNumOfCustomers();
   public Customer getCustomer(int customerIndex);
}
