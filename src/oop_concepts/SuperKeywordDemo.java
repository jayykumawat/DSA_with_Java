package oop_concepts;

/*
Problem:
Demonstrate usage of super keyword in Java.

super is used to:
1. Refer parent class variable
2. Call parent class method
3. Call parent class constructor

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Person {

    String name = "Parent Name";

    Person() {
        System.out.println("Parent Constructor Called");
    }

    void show() {
        System.out.println("Parent Method");
    }
}

class Employee extends Person {

    String name = "Child Name";

    Employee() {
        super();  // Calling parent constructor
        System.out.println("Child Constructor Called");
    }

    void display() {

        // Access parent variable
        System.out.println("Parent name: " + super.name);

        // Access child variable
        System.out.println("Child name: " + this.name);

        // Call parent method
        super.show();
    }
}

public class SuperKeywordDemo {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.display();
    }
}
