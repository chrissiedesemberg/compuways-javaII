package chapter21_exploring_java_io.directories;

import java.io.File;

public class DirList {

    public static void main(String[] args) {

        String dirName = "/java";
        File f1 = new File(dirName);

        if(f1.isDirectory()) {
            System.out.println("Directory of " + dirName);
            String s[] = f1.list();

            for (int i=0; i < s.length; i++) {
                File f = new File(dirName + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                } else {
                    System.out.println(s[i] + " is not a directory");
                }
            }

        } else {
            System.out.println(dirName + " is not a directory");
        }

    }

}
