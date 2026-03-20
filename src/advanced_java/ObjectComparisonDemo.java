package advanced_java;

import java.util.*;

/*
PROBLEM:
Demonstrate how objects are compared in Java using:
equals(), hashCode(), Comparable, and Comparator.

CONCEPT:
Java provides multiple ways to compare objects:
1. equals() → value comparison
2. hashCode() → hashing for collections
3. Comparable → natural sorting
4. Comparator → custom sorting

RULES:
1. equals() and hashCode() must be overridden together.
2. If two objects are equal → hashCode must be same.
3. Comparable defines natural ordering.
4. Comparator defines custom ordering.
5. HashSet/HashMap rely on hashCode + equals.

TIME COMPLEXITY:
Sorting → O(n log n)

SPACE COMPLEXITY:
O(1) extra (in-place sorting)
*/

// Custom class
class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // equals() override
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;

        Student s = (Student) obj;
        return this.id == s.id;
    }

    // hashCode() override
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Comparable (natural sorting by id)
    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class ObjectComparisonDemo {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Jay");
        Student s2 = new Student(1, "Jay");

        // equals vs ==
        System.out.println("Using == : " + (s1 == s2));
        System.out.println("Using equals(): " + s1.equals(s2));

        // HashSet behavior
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);

        System.out.println("HashSet size: " + set.size());

        // Sorting using Comparable
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Rahul"));
        list.add(new Student(1, "Jay"));
        list.add(new Student(2, "Aman"));

        Collections.sort(list);

        System.out.println("Sorted by ID:");
        System.out.println(list);

        // Sorting using Comparator (by name)
        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));

        System.out.println("Sorted by Name:");
        System.out.println(list);
    }
}
