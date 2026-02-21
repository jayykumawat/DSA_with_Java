package oop_concepts;

/*
Problem:
Demonstrate Constructor Overloading.

Concept:
Constructor Overloading means:
Multiple constructors in same class
with different parameter lists.

Rules:
- Same class name
- Different parameters (number/type/order)

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Student {

    int id;
    String name;
    double marks;

    // Constructor 1
    Student() {
        id = 0;
        name = "Not Assigned";
        marks = 0.0;
    }

    // Constructor 2
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.marks = 0.0;
    }

    // Constructor 3
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Marks: " + marks);
    }
}

public class ConstructorOverloadingDemo {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(101, "Aman");
        Student s3 = new Student(102, "Jayy", 88.5);

        s1.display();
        s2.display();
        s3.display();
    }
}
