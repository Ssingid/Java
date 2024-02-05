package additiona;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatedCharactersTest {
    RepeatedCharacters repeatedCharacters = new RepeatedCharacters ();
    @Test
    public void testCharacterCount() {
        ArrayList<Character> arrayList = new ArrayList<>(Arrays.asList('c', 'a'));
        Assert.assertEquals(arrayList, repeatedCharacters. getRepeatedCharacters ("canaca"));
    }
}
