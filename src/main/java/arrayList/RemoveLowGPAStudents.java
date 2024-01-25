import java.util.ArrayList;

class Student {
    String firstName;
    String lastName;
    double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }
}

public class RemoveLowGPAStudents {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Alice", "Smith", 2.8));
        studentList.add(new Student("Bob", "Johnson", 3.0));
        studentList.add(new Student("Eva", "Williams", 3.8));


        System.out.println("Students before removal:");
        printStudents(studentList);

        double averageGPA = calculateAverageGPA(studentList);

        removeLowGPAStudents(studentList, averageGPA);

        System.out.println("\nStudents after removal:");
        printStudents(studentList);
    }

    private static void removeLowGPAStudents(ArrayList<Student> students, double averageGPA) {
        students.removeIf(student -> student.GPA < averageGPA);
    }

    private static double calculateAverageGPA(ArrayList<Student> students) {
        if (students.isEmpty()) {
            return 0.0;
        }

        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.GPA;
        }

        return totalGPA / students.size();
    }

    private static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Name: " + student.firstName + " " + student.lastName + ", GPA: " + student.GPA);
        }
    }
}