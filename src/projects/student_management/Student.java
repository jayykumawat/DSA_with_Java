package projects.student_management;

/*
PROBLEM:
Represent a Student entity with basic attributes.

CONCEPT:
Encapsulation is used to protect data and provide controlled access.

RULES:
1. Use private variables.
2. Provide getters and setters.
3. Override toString() for readable output.

TIME COMPLEXITY:
O(1) for getters/setters

SPACE COMPLEXITY:
O(1)
*/

public class Student {

    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString method
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}