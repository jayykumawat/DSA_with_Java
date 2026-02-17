package oop_concepts;

/*
Problem:
Create a Student class with fields and a method to display student info.

Approach:
- Create a Student class
- Use constructor to initialize fields
- Use display() method to print details

Time Complexity: O(1)
Space Complexity: O(1)
*/
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class StudentClassDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman");
        Student s2 = new Student(2, "Jayy");

        s1.display();
        s2.display();
    }
}
