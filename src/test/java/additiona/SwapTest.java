package additiona;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SwapTest {
    Swap swap = new Swap();
    @Test
    public void testSwapping() {
        Assert.assertArrayEquals(new int[]{8, 9}, swap.swappingElement(9, 8));
    }
}
