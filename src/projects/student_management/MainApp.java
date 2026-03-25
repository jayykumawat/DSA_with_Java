package projects.student_management;

import java.lang.classfile.ClassFile.Option;
import java.util.Optional;
import java.util.Scanner;

/*
UPGRADE:
Now using Service Layer (clean architecture)
*/

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    service.addStudent(new Student(id, name, age));
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();

                    Optional<Student> found = service.findStudentById(searchId);

                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println("Student not found!");
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int deleteId = sc.nextInt();

                    if (service.deleteStudent(deleteId))
                        System.out.println("Deleted successfully!");
                    else
                        System.out.println("Student not found!");
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();

                    if (service.updateStudent(updateId, newName, newAge))
                        System.out.println("Updated successfully!");
                    else
                        System.out.println("Student not found!");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}