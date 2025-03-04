import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperations {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Method to add a student
    public void addStudent() {
        System.out.print("Enter PRN: ");
        String prn = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter DOB (dd-mm-yyyy): ");
        String dob = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        students.add(new Student(prn, name, dob, marks));
        System.out.println("Student added successfully!");
    }

    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }

    // Method to search a student by PRN
    public void searchByPRN() {
        System.out.print("Enter PRN to search: ");
        String prn = scanner.nextLine();
        for (Student student : students) {
            if (student.getPRN().equals(prn)) {
                student.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to search a student by name
    public void searchByName() {
        System.out.print("Enter Name to search: ");
        String name = scanner.nextLine();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to search a student by position
    public void searchByPosition() {
        System.out.print("Enter position (index starting from 0): ");
        int pos = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        if (pos >= 0 && pos < students.size()) {
            students.get(pos).display();
        } else {
            System.out.println("Invalid position.");
        }
    }

    // Method to update a student's details
    public void updateStudent() {
        System.out.print("Enter PRN of student to update: ");
        String prn = scanner.nextLine();
        for (Student student : students) {
            if (student.getPRN().equals(prn)) {
                System.out.print("Enter new Name: ");
                student.setName(scanner.nextLine());
                System.out.print("Enter new DOB: ");
                student.setDOB(scanner.nextLine());
                System.out.print("Enter new Marks: ");
                student.setMarks(scanner.nextDouble());
                scanner.nextLine();  // Consume newline
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Method to delete a student
    public void deleteStudent() {
        System.out.print("Enter PRN of student to delete: ");
        String prn = scanner.nextLine();
        for (Student student : students) {
            if (student.getPRN().equals(prn)) {
                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}

