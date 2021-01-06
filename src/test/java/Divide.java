import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Divide extends Assert {
    Calculator calculator;

    @Before
    public void beforeTest() {
        System.out.println("Before: создаем экземпляр калькулятора");
        calculator = new Calculator();
    }

    @Test
    public void testDivide() {
        System.out.println("Test: testDivide passed");
        assertEquals(2, calculator.getDivide(4,2));
    }

    @After
    public void afterTest() {
        System.out.println("After: обнуляем переменную калькулятора");
        calculator = null;
    }
}
