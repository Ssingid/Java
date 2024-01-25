package arrayLists;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class arrayListTraversalTest {

    @Test
    public void testTraverseArrayListUsingEnhancedForLoop() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("string1");
        stringList.add("string2");
        stringList.add("string3");
        stringList.add("string4");


        // Call the method you want to test
        ArrayList<String> result=arrayListTraversal.traverseArrayListUsingEnhancedForLoop();


        assertEquals(stringList,result);
    }

    @Test
    public void testTraverseArrayListUsingRegularForLoop() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("string1");
        stringList.add("string2");
        stringList.add("string3");
        stringList.add("string4");

        // Redirect System.out to capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method you want to test
        ArrayList<String> result= arrayListTraversal.traverseArrayListUsingRegularForLoop();

        // Compare the expected and actual output
        assertEquals(stringList, result);
    }
}
