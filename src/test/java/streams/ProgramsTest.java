package streams;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ProgramsTest {
    Programs programs = new Programs();

    @Test
    public void testAverageOfAllOdds() {
        Assert.assertEquals(25.0, programs.getAverageOfAllOdds(List.of(2, 1, 7)), 0.001);
    }
    @Test
    public void testCapitalizeWords() {
        Assert.assertEquals(List.of("Anjuri", "Sai", "Shiva"), programs.getCapitalize(new String[]{"shiva", "sai", "anjuri"}));
    }
}
