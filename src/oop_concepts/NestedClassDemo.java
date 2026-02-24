package oop_concepts;

/*
Problem:
Demonstrate Nested and Inner Classes in Java.

Concept:
A nested class is a class defined inside another class.

Types:
1. Static Nested Class
2. Non-static Inner Class

Time Complexity: O(1)
Space Complexity: O(1)
*/
class OuterClass {

    String message = "Hello from Outer Class";
    // 🔹 Inner Class (Non-static)
    //but this one depend on the outer class for run
    class InnerClass {
        void display() {
            System.out.println("Inside Inner Class");
            System.out.println("Accessing outer variable: " + message);
        }
    }
}
public class NestedClassDemo {
    // 🔹 Static Nested Class
    //not depend on the outer class
    static class StaticNested {
        void show() {
            System.out.println("Inside Static Nested Class");
        }
    }
    public static void main(String[] args) {

        // Using Static Nested Class
        StaticNested staticObj = new StaticNested();
        staticObj.show();

        System.out.println("-----");

        // Using Inner Class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass innerObj = outer.new InnerClass();
        innerObj.display();
    }
}
