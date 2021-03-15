package chapter12_enumerations_autoboxing_annotations.wrappers;

public class Wrap {
    public static void main(String[] args) {
        Integer iOb = Integer.valueOf(100);

        double i = iOb.doubleValue();
        System.out.println(i + " " + iOb);
    }

}
