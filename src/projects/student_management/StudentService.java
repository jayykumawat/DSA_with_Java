package projects.student_management;

import java.util.ArrayList;

/*
PROBLEM:
Handle all business logic for student operations.

CONCEPT:
Service layer separates logic from UI.

RULES:
1. No direct ArrayList access in MainApp
2. All operations go through service
3. Clean modular design

TIME COMPLEXITY:
Add → O(1)
Search → O(n)
Delete → O(n)

SPACE COMPLEXITY:
O(n)
*/

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    // ADD
    public void addStudent(Student s) {
        students.add(s);
    }

    // VIEW
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    // SEARCH
    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // DELETE
    public boolean deleteStudent(int id) {
        Student s = findStudentById(id);

        if (s != null) {
            students.remove(s);
            return true;
        }
        return false;
    }

    // UPDATE
    public boolean updateStudent(int id, String newName, int newAge) {
        Student s = findStudentById(id);

        if (s != null) {
            s.setName(newName);
            s.setAge(newAge);
            return true;
        }
        return false;
    }
}