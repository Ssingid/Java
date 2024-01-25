package arrayLists;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import java.util.ArrayList;

public class arrayListToArrayTest {

    @Test
    public void testConvertArrayListToArray() {
        // Test case 1: ArrayList with elements
        ArrayList<String> stringList1 = new ArrayList<>();
        stringList1.add("String1");
        stringList1.add("String2");
        stringList1.add("String3");
        String[] resultArray1 = arrayListToArray.convertArrayListToArray(stringList1);
        String[] expectedArray1 = {"String1", "String2", "String3"};
        assertArrayEquals(expectedArray1, resultArray1);

        // Test case 2: Empty ArrayList
        ArrayList<String> stringList2 = new ArrayList<>();
        String[] resultArray2 = arrayListToArray.convertArrayListToArray(stringList2);
        String[] expectedArray2 = {}; // Expect an empty array
        assertArrayEquals(expectedArray2, resultArray2);

        // Test case 3: ArrayList with null elements
        ArrayList<String> stringList3 = new ArrayList<>();
        stringList3.add(null);
        String[] resultArray3 = arrayListToArray.convertArrayListToArray(stringList3);
        String[] expectedArray3 = {null};
        assertArrayEquals(expectedArray3, resultArray3);

        // Test case 4: ArrayList with duplicate elements
        ArrayList<String> stringList4 = new ArrayList<>();
        stringList4.add("String4");
        stringList4.add("String4");
        stringList4.add("String6");
        String[] resultArray4 = arrayListToArray.convertArrayListToArray(stringList4);
        String[] expectedArray4 = {"String4", "String4", "String6"};
        assertArrayEquals(expectedArray4, resultArray4);
    }
}

