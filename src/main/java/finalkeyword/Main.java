package finalkeyword;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        //final variable and methods can be accessed within the same package.
        System.out.println("Student name: " + student.studentName);
        System.out.println("Student Roll number: " + student.getRollNumber());
    }
}