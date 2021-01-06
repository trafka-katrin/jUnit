import org.junit.Assert;
import org.junit.Test;

public class MathMax extends Assert {

    @Test
    public void testMax() {
        System.out.println("Test: testMax passed");
        assertEquals(3, Math.max(3, 2));
    }
}
