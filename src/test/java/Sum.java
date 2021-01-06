import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Sum extends Assert {
    private int x;
    private int y;
    private int result;


    public Sum(int x, int y, int result) {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    Calculator calculator;

    @Before
    public void beforeTest() {
        System.out.println("Before: создаем экземпляр калькулятора");
        calculator = new Calculator();
    }

    @Test
    public void testSumP() {
        System.out.println("Test: testSumP passed");
        assertEquals(result, calculator.getSum(x,y));
    }

    @Test
    public void testSum() {
        System.out.println("Test: testSum passed");
        assertEquals(5, calculator.getSum(3,2));
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> testData() {
        return Arrays.asList(new Integer[][] { { 2, 2, 4 },{ 5, 6, 11 }, { 7, 8, 15 } });
    }

    @After
    public void afterTest() {
        System.out.println("After: обнуляем переменную калькулятора");
        calculator = null;
    }

}
