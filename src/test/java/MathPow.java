import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathPow extends Assert {


    @Test
    public void testPow() {
        System.out.println("Test: testPow passed");
        assertEquals(8, Math.pow(2,3),0);
    }




}
