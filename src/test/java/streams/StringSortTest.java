package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StringSortTest {
    StringSort stringSort = new StringSort();
    @Test
    public void testStringSort() {
        Assert.assertEquals(List.of("ash", "oak", "elm", "pine", "maple", "birch", "spruce"),
                stringSort.sortBasedOnLength(new String[]{"maple", "birch", "oak", "pine", "elm", "spruce", "ash"}));
    }
}