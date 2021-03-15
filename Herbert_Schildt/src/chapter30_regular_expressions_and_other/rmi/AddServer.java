package chapter30_regular_expressions_and_other.rmi;

import java.rmi.Naming;

public class AddServer {

    public static void main(String[] args) {
        try {
            AddServerImpl addServerImpl = new AddServerImpl();
            Naming.rebind("AddServer", addServerImpl);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
