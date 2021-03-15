package chapter30_regular_expressions_and_other.reflections;

import java.lang.reflect.*;

public class ReflectionDemo2 {
    public static void main(String[] args) {

        try {
            A a = new A();
            Class<?> c = a.getClass();
            System.out.println("\n=============================================\n");
            Method methods[] = c.getDeclaredMethods();
            for (int i = 0; i < methods.length; i++){
                int modifiers = methods[i].getModifiers();
                if(Modifier.isPublic(modifiers)) {
                    System.out.println("Public Method(s): ");
                    System.out.println(" " + methods[i].getName());
                }
                else if (Modifier.isPrivate(modifiers)) {
                    System.out.println("\nPrivate Methods: ");
                    System.out.println(" " + methods[i].getName());
                }
             else if (Modifier.isProtected(modifiers)) {
                        System.out.println("\nProtected Methods: ");
                        System.out.println(" " + methods[i].getName());
             }
        }} catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

}

class A {
    public void a1(){}
    public void a2(){}
    protected void a3(){}
    private void a4(){}

}