package chapter14_generics;

public class TwoGenDemo {

    public static void main(String[] args) {

        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Generics");

        tgObj.showTypes();

        int v = tgObj.getob1();
        System.out.println("Value: " + v);

        String str = tgObj.getob2();
        System.out.println("String: " + str);
    }

}
