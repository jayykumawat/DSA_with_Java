package collections.advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Demonstrates Comparator interface.
 */

class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(3, "Rahul"));
        employees.add(new Employee(1, "Jay"));
        employees.add(new Employee(2, "Aman"));

        Collections.sort(employees, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });

        System.out.println("Sorted by Name:");
        System.out.println(employees);
    }
}
