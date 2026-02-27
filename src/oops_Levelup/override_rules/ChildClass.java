package oops_Levelup.override_rules;

public class ChildClass extends ParentClass {

    // This is NOT overriding.
    // It is method hiding (static methods are hidden, not overridden)
    public static void staticMethod() {
        System.out.println("Child Static Method");
    }

    // This would cause compile-time error
    // public void finalMethod() { }

    // This is proper overriding
    @Override
    public void normalMethod() {
        System.out.println("Child Normal Method");
    }
}