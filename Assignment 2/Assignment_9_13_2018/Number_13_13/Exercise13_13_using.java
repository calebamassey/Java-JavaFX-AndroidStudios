package Assignment_9_13_2018.Number_13_13;

public class Exercise13_13_using {
    /**
     * Main method
     */
    public static void main(String[] args){
        //Instantiate a Course1 object named Course1 with a courseName of "DS"  and add 3 students S1,S2, S3
        Course1 course1 = new Course1("DS");
        course1.addStudent("s1");
        course1.addStudent("s2");
        course1.addStudent("s3");

        //Create a second Course1 object as a clone of course1 and add 4 new students to it;
        Course1 course2 = course1.clone();

        course2.addStudent("s4");
        course2.addStudent("s5");

        System.out.println(course1 == course2);
        System.out.println(course1.getCourse1Name() == course2.getCourse1Name());
        System.out.println(course1.getStudents() == course2.getStudents());
    }
}
