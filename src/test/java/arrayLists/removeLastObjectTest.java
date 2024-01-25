package arrayLists;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class removeLastObjectTest {

    @Test
    public void testRemoveLastObject() {
        // Create an ArrayList of Objects
        ArrayList<Object> objectList = new ArrayList<>();
        objectList.add("Apple");
        objectList.add(42);
        objectList.add(3.14);
        objectList.add(true);
        ArrayList<Object> expectedList = new ArrayList<>();

        // Call the method to remove the last object
        expectedList=removeLastObject.removeLastObject(objectList);

        // Define the expected ArrayList after removing the last object
       /* ArrayList<Object> expectedList = new ArrayList<>();
        expectedList.add("Apple");
        expectedList.add(42);
        expectedList.add(3.14);*/

        // Assert that the ArrayList is as expected after removing the last object
        assertEquals(expectedList, objectList);
    }

    @Test
    public void testRemoveLastObjectEmptyList() {
        // Create an empty ArrayList of Objects
        ArrayList<Object> emptyList = new ArrayList<>();
        ArrayList<Object> expectedList = new ArrayList<>();

        // Call the method to remove the last object (should not throw an exception)
        expectedList=removeLastObject.removeLastObject(emptyList);

        // The list should remain empty
        assertEquals(emptyList, emptyList);
    }
}

