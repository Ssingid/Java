package additiona;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SumItemTest {
    SumItem sumItem = new SumItem ();
    @Test
    public void testGetSumItems() {
        Assert.assertEquals(15, sumItem.getSumItems(new int[]{1,2,3,4,5}));
        Assert.assertNotEquals(2, sumItem.getSumItems(new int[]{1,2,3,4}));
    }
}
