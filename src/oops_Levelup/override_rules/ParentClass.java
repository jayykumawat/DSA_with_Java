package oops_Levelup.override_rules;

public class ParentClass {

    public static void staticMethod() {
        System.out.println("Parent Static Method");
    }

    public final void finalMethod() {
        System.out.println("Parent Final Method");
    }

    public void normalMethod() {
        System.out.println("Parent Normal Method");
    }
}