package chapter18_java_lang;

import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        Double d1 = Double.valueOf(3.14159);
        Double d2 = Double.valueOf("314159E-5");

        System.out.println(d1 + " = " + d2 + " -> " + d1.equals(d2));

        Double d3 = Double.valueOf(1/0.);
        Double d4 = Double.valueOf(0/0.);
        System.out.println(d3 + ": " + d3.isInfinite() + ", " + d3.isNaN());
        System.out.println(d4 + ": " + d4.isInfinite() + ", " + d4.isNaN());

//        Runtime r = Runtime.getRuntime();
//        Process p = null;
//
//        try {
//            p = r.exec("textEdit");
//            p.waitFor();
//        } catch (Exception e) {
//            System.out.println("Error running textEdit.");
//        }
//        System.out.println("TextEdit returned " + p.exitValue());

//        Runtime.Version ver = Runtime.version();
//
//        System.out.println("Feature release counter: " + ver.feature());
//        System.out.println("Interim release counter: " + ver.interim());
//        System.out.println("Update release counter: " + ver.update());
//        System.out.println("Patch release counter: " + ver.patch());
//
//        System.out.println();
//        System.out.println("============================================================");
//        System.out.println();
//
//        double theta = 120.0;
//        System.out.println(theta + " degrees is " + Math.toRadians(theta) + " radians.");
//
//        theta = 1.312;
//        System.out.println(theta + " radians is " + Math.toDegrees(theta) + " degrees.");
//





    }
}
