package streams;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;  // Import List from java.util

public class SquaresTest {
    Squares squares = new Squares();

    @Test
    public void testSumOfSquares() {
        Assert.assertEquals(14, squares.sumOfSquares(List.of(1, 2, 3)));
    }
}
