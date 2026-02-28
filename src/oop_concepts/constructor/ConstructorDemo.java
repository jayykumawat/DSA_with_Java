package oop_concepts.constructor;

/*
Problem:
Understand how constructors work in Java.

Concepts Covered:
- Constructor
- Default constructor
- Parameterized constructor
- Object initialization

Definition:
A constructor is a special method:
- Same name as class
- No return type (not even void)
- Automatically called when object is created

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Car {

    String brand;
    int year;

    // Default Constructor
    Car() {
        brand = "Unknown";
        year = 0;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {

        // Using Default Constructor
        Car car1 = new Car();
        car1.display();

        System.out.println("----------------");

        // Using Parameterized Constructor
        Car car2 = new Car("Tesla", 2024);
        car2.display();
    }
}
