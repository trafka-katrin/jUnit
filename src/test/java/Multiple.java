import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;


public class Multiple extends Assert {

    Calculator calculator;



    @Before
    public void beforeTest() {
        System.out.println("Before: создаем экземпляр калькулятора");
        calculator = new Calculator();
    }

    @Test
    public void testMult() {
        System.out.println("Test: testMultiple passed");
        assertEquals(6, calculator.getMultiple(2,3));
    }


    @After
    public void afterTest() {
        System.out.println("After: обнуляем переменную калькулятора");
        calculator = null;
    }
}
