package chapter14_generics;

public class NonGenDemo {

    public static void main(String[] args) {

        NonGen iOb;

        iOb = new NonGen(89);

        iOb.showTupe();

        int v = (Integer) iOb.getob();
        System.out.println("value : " + v);
        System.out.println();


        NonGen strOb = new NonGen("Non-Generics InputStreamEnumerator");
        strOb.showTupe();

        String str = (String) strOb.getob();
        System.out.println("value: " + str);

        iOb = strOb;
        v = (Integer) iOb.getob();
    }

}
