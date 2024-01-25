package strings;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class vowelCountTest {

    @Test
    public void testVowelsCount() {
        // Test case 1: Basic test
        assertEquals(3, vowelCount.vowelsCounting("Hello World"));

        // Test case 2: Test with an empty string
        assertEquals(0, vowelCount.vowelsCounting(""));
        assertEquals(0, vowelCount.vowelsCounting(" "));

        // Test case 3: Test with all vowels
        assertEquals(10, vowelCount.vowelsCounting("AEIOUaeiou"));


    }
}
