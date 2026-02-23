package oop_concepts;

/*
Problem:
Demonstrate the use of final keyword in Java.

final can be used with:
1. Variable  -> value cannot be changed
2. Method    -> cannot be overridden
3. Class     -> cannot be inherited

Time Complexity: O(1)
Space Complexity: O(1)
*/

// Final class (cannot be extended)
final class FinalClassExample {
    void show() {
        System.out.println("This is a final class.");
    }
}

class Parent {

    // Final method (cannot be overridden)
    final void display() {
        System.out.println("This is a final method in Parent.");
    }
}

class Child extends Parent {
    // ❌ This would cause error:
    // void display() { }
}

public class FinalKeywordDemo {

    public static void main(String[] args) {

        // Final variable
        final int number = 100;
        System.out.println("Final variable: " + number);

        // number = 200; ❌ Error: cannot reassign

        Parent obj = new Parent();
        obj.display();

        FinalClassExample example = new FinalClassExample();
        example.show();
    }
}
