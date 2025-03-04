public class Student {
    private String prn;
    private String name;
    private String dob;
    private double marks;

    // Constructor
    public Student(String prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    // Getters
    public String getPRN() {
        return prn;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return dob;
    }

    public double getMarks() {
        return marks;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Display method
    public void display() {
        System.out.println("PRN: " + prn + ", Name: " + name + ", DOB: " + dob + ", Marks: " + marks);
    }
}
