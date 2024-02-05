package streams;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class IntegerFilterTest {
    IntegerFilter integerFilter = new IntegerFilter();
    @Test
    public void testFilteredInteger() {
        Assert.assertEquals(List.of(4, 16), integerFilter.getFilteredIntegers(List.of(1, 2, 3, 4)));
    }
}
