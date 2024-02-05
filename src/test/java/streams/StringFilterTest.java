package streams;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.function.Predicate;

public class StringFilterTest {
    StringFilter stringFilter = new StringFilter();
    @Test
    public void testStrings() {
        List<String> stringList = List.of("Siva", "Sai", "Anjuri");
        Predicate<String> isStartsWithA = string -> string.startsWith("A");
        Assert.assertEquals(List.of("Anjuri"), stringFilter.getListWithA(stringList, isStartsWithA));
    }
}
