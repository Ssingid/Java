package arrayLists;
import java.util.ArrayList;
public class student {
    String firstName;
    String lastName;
    double GPA;

    // Constructor
    public student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }
}


class FilterStudentsByGPA {

    public static ArrayList<student> removeStudentsBelowAverageGPA(ArrayList<student> studentList) {

        // Calculate the average GPA
        double averageGPA = calculateAverageGPA(studentList);

        // Remove students with GPA less than the average GPA
        studentList.removeIf(student -> student.GPA < averageGPA);

        return studentList;
    }

    public static double calculateAverageGPA(ArrayList<student> students) {
        if (students.isEmpty()) {
            return 0.0;
        }

        double totalGPA = 0.0;
        for (student student : students) {
            totalGPA += student.GPA;
        }

        return totalGPA / students.size();
    }
}
