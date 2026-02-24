package oop_concepts;

/*
Problem:
Demonstrate the use of abstract class in Java.

Concept:
- Abstract class cannot be instantiated.
- It can have abstract methods (without body).
- It can also have normal methods.
- Child class must implement abstract methods.

Time Complexity: O(1)
Space Complexity: O(1)
*/

// Abstract class
abstract class Shape {

    // Abstract method (no body)
    abstract double area();

    // Normal method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Child class
class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14159 * radius * radius;
    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {

        // Shape s = new Shape(); Not allowed

        Shape obj = new Circle(5);

        obj.display();
        System.out.println("Area of circle: " + obj.area());
    }
}
