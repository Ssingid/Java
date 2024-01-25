package strings;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
public class rotationOfStringTest {
    @Test
    public void testIsRotation() {
        // Test case 1: Basic test with rotation
        String input1 = "abcd";
        String input2a = "cdab"; // Rotation of "abcd"
        String input2b = "bcda"; // Another rotation of "abcd"
        assertTrue(rotationOfString.isRotation("abcd", "cdab"));
        assertTrue(rotationOfString.isRotation("abcd", "bcda"));
        assertTrue(rotationOfString.isRotation("HelloWorld","WorldHello"));
        //Including spaces
        assertFalse(rotationOfString.isRotation("ab cd", "bc da"));

        // Test case 2: Test with non-rotation
        assertFalse(rotationOfString.isRotation("world", "hello"));

        // Test case 3: Test with empty strings
        assertTrue(rotationOfString.isRotation("", ""));
    }
}
