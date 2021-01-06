import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultWithParams extends Assert {

    private int x;
    private int y;
    private int result;
    Calculator calculator;

    public MultWithParams(int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    @Before
    public void beforeTest() {
        System.out.println("Before: создаем экземпляр калькулятора");
        calculator = new Calculator();
    }

    @Test
    public void testMult() {
        System.out.println("Test: testMultiple(with params) passed");
        assertEquals (result, calculator.getMultiple(x,y));
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> testData() {
        return Arrays.asList(new Integer[][] { { 2, 2, 4 },{ 5, 6, 30 }, { 7, 8, 56 } });
    }

}
