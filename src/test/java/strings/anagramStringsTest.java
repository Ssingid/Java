package strings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class anagramStringsTest{
    //anagramStrings anagramStrings=new anagramStrings();

    @Test
    public void testAreAnagrams() {
        Assert.assertTrue(anagramStrings.areAnagrams("listen", "silent"));
        Assert.assertTrue(anagramStrings.areAnagrams("triangle", "integral"));

    }

    @Test
    public void testNotAnagrams() {
        assertFalse(anagramStrings.areAnagrams("hello", "world"));
        assertFalse(anagramStrings.areAnagrams("abc", "def"));
        assertFalse(anagramStrings.areAnagrams("Anagram", "NotAnagram"));
    }

    @Test
    public void testAnagramsIgnoreCase() {
        Assert.assertTrue(anagramStrings.areAnagrams("State", "Taste"));
        Assert.assertTrue(anagramStrings.areAnagrams("Car", "Rac"));
        Assert.assertTrue(anagramStrings.areAnagrams("Eleven plus two", "Twelve plus one"));
    }

    @Test
    public void testEmptyStrings() {
        Assert.assertTrue(anagramStrings.areAnagrams("", ""));
    }

    @Test
    public void testSpacesOnly() {
        Assert.assertTrue(anagramStrings.areAnagrams("   ", "   "));
    }

}
