package additiona;

import org.junit.Assert;
import org.testng.annotations.Test;

public class StringRotatedTest {
    StringRotated stringrotated = new StringRotated();
    @Test
    public void testStringRotation() {
        Assert.assertTrue(stringrotated.isStringRotated("sandy123", "123sandy"));
    }
}
