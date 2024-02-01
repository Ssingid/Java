package additiona;

import org.junit.Assert;
import org.testng.annotations.Test;

public class FactorialTest{
    Factorial factorial = new Factorial();
    @Test
    public void FactorialTest() {
        Assert.assertEquals(120, factorial.getFactorial(5));
        Assert.assertNotEquals(120, factorial.getFactorial(4));
        Assert.assertEquals(1, factorial.getFactorial(0));
        Assert.assertEquals(-1, factorial.getFactorial(-121));

    }
}

