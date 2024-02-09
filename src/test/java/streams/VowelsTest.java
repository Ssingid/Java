package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Optional;

public class VowelsTest {
    streams.Vowels vowels = new streams.Vowels();
    @Test
    public void testVowelsCount() {
        String[] arr = {"shiva", "sai", "anjuri"};
        Map<String, Integer> map = vowels.getVowelCount(arr);
        Assert.assertEquals(2, (int) map.get("shiva"));
    }
}
