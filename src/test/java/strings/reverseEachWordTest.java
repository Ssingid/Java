package strings;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class reverseEachWordTest {

    @Test
    public void testReverseEachWord() {
        // Test case 1: Basic test

        assertEquals("olleH dlroW", reverseEachWord.reverseEachWord("Hello World"));

        // Test case 2: Test with multiple spaces between words
        assertEquals("  IAnepO   5.3-TPG", reverseEachWord.reverseEachWord("  OpenAI   GPT-3.5"));

        // Add more test cases as needed
    }

    @Test
    public void testReverseString() {
        // Test case 1: Basic test

        assertEquals("olleH", reverseEachWord.reverseString("Hello"));

        // Test case 2: Test with an empty string

        assertEquals("", reverseEachWord.reverseString(""));

        //to failure

        assertEquals("*##*", reverseEachWord.reverseString("*##*"));


    }
}
