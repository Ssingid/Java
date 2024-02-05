package streams;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class GroupingListTest {
    GroupingList groupingList = new GroupingList();
    @Test
    public void testGrouping() {
        Map<Integer, List<String>> integerListMap = groupingList
                .getListGroupByLength(List.of("hello", "i", "am", "shiva", "sai"));
        Assert.assertEquals(List.of("hello", "shiva"), integerListMap.get(5));
        Assert.assertNull(integerListMap.get(4));
    }
}
