package oop_concepts;

/*
Problem:
Demonstrate the use of static keyword in Java.

Concept:
static belongs to the class, not to objects.

Uses of static:
1. Static variable (shared among all objects)
2. Static method
3. Static block

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Employee {

    String name;
    static String company = "TechCorp"; // shared variable

    // Static block (runs once when class loads)
    static {
        System.out.println("Static block executed (Class Loaded)");
    }

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name + ", Company: " + company);
    }

    static void changeCompany(String newCompany) {
        company = newCompany;
    }
}

public class StaticKeywordDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee("Aman");
        Employee e2 = new Employee("Jayy");

        e1.display();
        e2.display();

        System.out.println("----- Changing Company -----");

        Employee.changeCompany("NextGen Solutions");

        e1.display();
        e2.display();
    }
}
