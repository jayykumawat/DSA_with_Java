package oops_Levelup.override_rules;

public class OverrideTest {

    public static void main(String[] args) {

        ParentClass obj = new ChildClass();

        // Static method → depends on reference type (compile-time binding)
        obj.staticMethod();  

        // Normal method → depends on object type (runtime polymorphism)
        obj.normalMethod();  

        obj.finalMethod();
    }
}
