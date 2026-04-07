package projects.student_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    private List<Student>students;
StudentService(){
    students=FileHandler.loadStudent();
}

    private void save(){
    FileHandler.saveStudents(new ArrayList<>(students));
}

public boolean isDuplicateId(int id) {
    return findStudentById(id).isPresent();
}
    // ADD
    public void addStudent(Student s) {
        boolean exits = students.stream().anyMatch(st->st.getId()==s.getId());
        if(exits){
            System.out.println("Error Student with Id:- "+s.getId()+" already exits !");
        }
        else{
            students.add(s);
            System.out.println("✔ Student added successfully!");
            save();
            LoggerUtil.log("Student added: ID=" + s.getId());

        }
    }

    // VIEW
    public void viewStudents() {

    if (students.isEmpty()) {
        System.out.println("No students available.");
        return;
    }

    System.out.println("\n--- Student List ---");

    for (Student s : students) {
        System.out.println("--------------------");
        System.out.println("ID   : " + s.getId());
        System.out.println("Name : " + s.getName());
        System.out.println("Age  : " + s.getAge());
    }

    System.out.println("--------------------");
}

    // SEARCH
    public Optional<Student> findStudentById(int id) {
       return students.stream().filter(s->s.getId()==id).findFirst();
    }

    // DELETE
    public boolean deleteStudent(int id) {
        boolean removed=students.removeIf(s->s.getId()==id);
        if(removed){
            save();
        }
        return removed;
    }

    // UPDATE
    public boolean updateStudent(int id, String newName, int newAge) {
        Optional<Student> studentOpt = findStudentById(id);

        if(studentOpt.isPresent()){
            Student s= studentOpt.get();
            s.setName(newName);
            s.setAge(newAge);
            save();
            LoggerUtil.log("Student added: ID=" + s.getId());

            return true;
        }
        return false;
    }
}