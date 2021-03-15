package chapter14_generics;

public class GenDemo {
    public static void main(String[] args) {

        //Integer
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("\nValue: " + v);
        System.out.println();

        //String
        Gen<String> sOb;

        sOb = new Gen<String>("I am a STRING... generics!");
        sOb.showType();

        String str = sOb.getOb();
        System.out.println("String: " + str);
        System.out.println();

    }
}
