package streams;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DuplicatesTest {
    Duplicates duplicates = new Duplicates();

    @Test
    public void testRemoveDuplicates() {
        Assert.assertEquals(List.of(1, 2, 3, 4, 5), duplicates.removeDuplicates(List.of(1, 1, 2, 2, 3, 1, 4, 5)));
    }
}

