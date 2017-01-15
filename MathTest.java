import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
    Math math;
    @Before
    public void setUp() throws Exception {
        math = new Math(7, 10);
    }
    @Test
    public void testAdd() {
        Assert.assertEquals(17, math.add());
    }
}
//the tough part is coming up with as many test scenarios you can think of
//the tough part is coming up with as many test scenarios you can think ofassertEquals(expectedVal,calculatedVal);