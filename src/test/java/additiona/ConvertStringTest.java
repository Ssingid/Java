package additiona;

import org.junit.Assert;
import org.testng.annotations.Test;

public class ConvertStringTest {

    ConvertString convertString = new ConvertString();
@Test
public void testConvertingString() {
    Assert.assertEquals("heLLO", convertString.convertString("HEllo"));
    Assert.assertEquals("Siva.", convertString.convertString("sIVA."));
    Assert.assertNotEquals("shiva", convertString.convertString("shiva"));
  }
}
