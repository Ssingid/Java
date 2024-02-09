package designpatterns;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingleton() {
        Singleton singleton = Singleton.getInstance("Shiva");
        Assert.assertEquals("Shiva", singleton.getData());
        Singleton singleton1 = Singleton.getInstance("second");
        Assert.assertEquals("Shiva", singleton1.getData());
    }
}
