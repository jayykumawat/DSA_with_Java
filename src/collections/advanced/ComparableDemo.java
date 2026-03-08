package collections.advanced;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Demonstrates Comparable interface.
 */

class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.id - s.id; // sort by id
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(3, "Rahul"));
        students.add(new Student(1, "Jay"));
        students.add(new Student(2, "Aman"));

        Collections.sort(students);

        System.out.println("Sorted Students:");
        System.out.println(students);
    }
}
