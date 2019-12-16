package Assignment_9_13_2018.Number_13_13;

public class Course1 implements Cloneable {
    public static String courseName;
    public static String[] students = new String[100];
    public static int numberOfStudents;

    public Course1(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourse1Name() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Left as an exercise in Exercise 10.9
    }

    @Override
    public Course1 clone() {
        try {
            Course1 c = (Course1) super.clone();
            c.courseName = new String(courseName);
            c.students = (String[]) this.students.clone();
            System.arraycopy(students, 0, c.students, 0, 100);
            return c;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
