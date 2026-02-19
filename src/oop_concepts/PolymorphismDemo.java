package oop_concepts;

/*
Problem:
Demonstrate runtime polymorphism using method overriding.

Approach:
- Create parent class Shape with area()
- Create child class Circle that overrides area()
- Use parent reference to hold child object

Time Complexity: O(1)
Space Complexity: O(1)
*/
class Shape {
    void area() {
        System.out.println("Area not defined");
    }
}

class Circle extends Shape {
    int radius = 5;

    @Override
    void area() {
        double result = 3.14159 * radius * radius;
        System.out.println("Circle area = " + result);
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
    }
}
