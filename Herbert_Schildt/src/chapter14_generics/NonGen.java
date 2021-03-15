package chapter14_generics;

public class NonGen {

    Object ob;

    public NonGen(Object o) {
        this.ob = o;
    }

    Object getob() {
        return ob;
    }

    void showTupe() {
        System.out.println("Type of ob is " + ob.getClass().getName());
    }



}
