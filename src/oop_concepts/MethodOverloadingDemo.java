package oop_concepts;

/*
Problem:
Demonstrate Method Overloading in Java.

Concept:
Method Overloading means:
Same method name but different parameter list.

Rules:
- Same method name
- Different number/type/order of parameters
- Return type alone cannot differentiate methods

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Calculator {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 (different number of parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3 (different parameter types)
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingDemo {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Add 2 ints: " + calc.add(10, 20));
        System.out.println("Add 3 ints: " + calc.add(5, 10, 15));
        System.out.println("Add 2 doubles: " + calc.add(2.5, 3.5));
    }
}
