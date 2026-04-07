package projects.student_management;

import java.util.Optional;
import java.util.Scanner;

/*
UPGRADE:
Now using Service Layer (clean architecture)
*/

public class MainApp {
    
    private static void printMenu() {
    System.out.println("\n==============================");
    System.out.println("   STUDENT MANAGEMENT SYSTEM");
    System.out.println("==============================");
    System.out.println("1. Add Student");
    System.out.println("2. View Students");
    System.out.println("3. Search Student");
    System.out.println("4. Delete Student");
    System.out.println("5. Update Student");
    System.out.println("6. Exit");
    System.out.println("==============================");
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

        printMenu();

            System.out.print("Enter choice: ");
            int choice ;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input Enter a Number !");
                sc.nextLine();
                continue;
            }

            switch (choice) {

            case 1:
    try {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (id <= 0) {
            throw new InvalidInputException("ID must be positive!");
        }

        if (service.isDuplicateId(id)) {
            throw new InvalidInputException("Duplicate ID not allowed!");
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if (age <= 0 || age > 100) {
            throw new InvalidInputException("Invalid age!");
        }

        service.addStudent(new Student(id, name, age));
        System.out.println("Student Added!");

    } catch (InvalidInputException e) {
        System.out.println(e.getMessage());
    } catch (Exception e) {
        System.out.println("Invalid input!");
        sc.nextLine();
    }
    break;

                case 2:
                    service.viewStudents();
                    break;

        case 3:
    try {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        Optional<Student> s = service.findStudentById(id);

        if (s != null)
            System.out.println(s);
        else
            System.out.println("Not found");

    } catch (Exception e) {
        System.out.println("Invalid input!");
        sc.nextLine();
    }
    break;

        case 4:
    try {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        if (service.deleteStudent(id))
            System.out.println("Deleted!");
        else
            System.out.println("Not found");

    } catch (Exception e) {
        System.out.println("Invalid input!");
        sc.nextLine();
    }
    break;

        case 5:
    try {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter New Name: ");
        String name = sc.nextLine();

        System.out.print("Enter New Age: ");
        int age = sc.nextInt();

        if (age <= 0 || age > 100) {
            throw new InvalidInputException("Invalid age!");
        }

        if (service.updateStudent(id, name, age))
            System.out.println("Updated!");
        else
            System.out.println("Not found");

    } catch (InvalidInputException e) {
        System.out.println(e.getMessage());
    } catch (Exception e) {
        System.out.println("Invalid input!");
        sc.nextLine();
    }
    break;

        case 6:
         System.out.println("\nThank you for using the system!");
         System.out.println("Goodbye 👋");
         sc.close();
         return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}