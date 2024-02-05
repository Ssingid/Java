package additiona;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SwappingWithOutThirdTest {
    @Test
    public void testSwapping() {
        SwappingWithOutThird swappingWithOutThird = new SwappingWithOutThird();
        Assert.assertArrayEquals(new int[]{8, 9}, swappingWithOutThird.getSwappingWithOutThird(9, 8));
    }
}
