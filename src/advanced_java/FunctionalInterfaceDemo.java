package advanced_java;

/*
PROBLEM:
Demonstrate how Functional Interfaces work in Java
and how they are used with Lambda Expressions.

CONCEPT:
A Functional Interface is an interface that contains
exactly one abstract method. These interfaces are the
foundation of Lambda Expressions in Java.

The @FunctionalInterface annotation ensures that
the interface has only one abstract method.

RULES:
1. A Functional Interface must contain exactly one abstract method.
2. It can contain multiple default or static methods.
3. Lambda expressions can be used to implement Functional Interfaces.
4. Example built-in functional interfaces:
   Runnable, Comparator, Callable, Consumer, Supplier.

TIME COMPLEXITY:
Method invocation → O(1)

SPACE COMPLEXITY:
O(1) since only a simple function reference is used.
*/


@FunctionalInterface
interface Greeting {

    void sayHello(String name);

    // Default method allowed
    default void printMessage() {
        System.out.println("Default method inside Functional Interface");
    }
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        // Lambda Expression implementing Functional Interface
        Greeting greet = (name) -> {
            System.out.println("Hello " + name + ", welcome to Advanced Java!");
        };

        greet.sayHello("Jay");

        greet.printMessage();
    }
}
