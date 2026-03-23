package projects.student_management;

import java.util.ArrayList;
import java.util.Scanner;

/*
PROBLEM:
Create a simple console-based system to add and view students.

CONCEPT:
Uses ArrayList to store student data dynamically.

RULES:
1. Use loop for menu system.
2. Use Scanner for user input.
3. Store students in ArrayList.

TIME COMPLEXITY:
Add → O(1)
View → O(n)

SPACE COMPLEXITY:
O(n)
*/

public class MainApp {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    Student s = new Student(id, name, age);
                    students.add(s);

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    System.out.println("\nStudent List:");

                    for (Student student : students) {
                        System.out.println(student);
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}