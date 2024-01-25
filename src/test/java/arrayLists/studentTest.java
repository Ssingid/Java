package arrayLists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class studentTest {

    @Test
    public void testRemoveStudentsBelowAverageGPA() {
        // Create an ArrayList of Students
        ArrayList<student> studentList = new ArrayList<>();
        studentList.add(new student("John", "Doe", 3.5));
        studentList.add(new student("Jane", "Smith", 4.0));
        studentList.add(new student("Bob", "Johnson", 3.2));
        studentList.add(new student("Alice", "Williams", 3.8));

        // Call the method to remove students below average GPA
        ArrayList<student> resultList = FilterStudentsByGPA.removeStudentsBelowAverageGPA(studentList);

        // Calculate the expected remaining students based on the logic in your main method
        ArrayList<student> expectedRemainingStudents = new ArrayList<>();
        expectedRemainingStudents.add(new student("Jane", "Smith", 4.0));
        expectedRemainingStudents.add(new student("Alice", "Williams", 3.8));


        expectedRemainingStudents.equals(resultList);
    }

    @Test
    public void testStudentsForEmptyList(){
        ArrayList<student> studentList = new ArrayList<>();
        ArrayList<student> expectedRemainingStudents = new ArrayList<>();
        ArrayList<student> resultList=FilterStudentsByGPA.removeStudentsBelowAverageGPA(studentList);
        expectedRemainingStudents.equals(resultList);
    }

    @Test
    public void testCalculateAverageGPA() {
        // Create an ArrayList of Students
        ArrayList<student> studentList = new ArrayList<>();
        studentList.add(new student("John", "Doe", 3.5));
        studentList.add(new student("Jane", "Smith", 4.0));
        studentList.add(new student("Bob", "Johnson", 3.2));
        studentList.add(new student("Alice", "Williams", 3.8));

        // Call the method to calculate average GPA
        double averageGPA = FilterStudentsByGPA.calculateAverageGPA(studentList);

        // Define the expected average GPA based on the values in your studentList
        double expectedAverageGPA = (3.5 + 4.0 + 3.2 + 3.8) / 4;

        // Compare the expected and actual average GPA
        assertEquals(expectedAverageGPA, averageGPA, 0.001); // Using delta for double comparison
    }
}
