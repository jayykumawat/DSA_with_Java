package oop_concepts;

/*
Problem:
Demonstrate different access modifiers in Java.

Access Modifiers:
1. private    -> Accessible only inside same class
2. default    -> Accessible within same package
3. protected  -> Same package + subclasses
4. public     -> Accessible everywhere

Time Complexity: O(1)
Space Complexity: O(1)
*/

class AccessExample {

    private int privateVar = 10;
    int defaultVar = 20;          // default access
    protected int protectedVar = 30;
    public int publicVar = 40;

    void showPrivate() {
        System.out.println("Private Variable: " + privateVar);
    }
}

public class AccessModifierDemo {

    public static void main(String[] args) {

        AccessExample obj = new AccessExample();

        // privateVar not accessible directly
        // System.out.println(obj.privateVar); ❌ ERROR

        obj.showPrivate(); // Access through method

        System.out.println("Default Variable: " + obj.defaultVar);
        System.out.println("Protected Variable: " + obj.protectedVar);
        System.out.println("Public Variable: " + obj.publicVar);
    }
}

