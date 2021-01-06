import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.notification.RunNotifier;


public class Sum extends Assert {

    Calculator calculator;
    private CalculatorTestListener listener;
    RunNotifier notifier;

    @Before
    public void beforeTest() {
        System.out.println("Before: создаем экземпляр калькулятора");
        calculator = new Calculator();
         notifier = new RunNotifier();

    }

    @Test
    public void testSum() {
        System.out.println("Test: testSum passed");
        assertEquals(5, calculator.getSum(3,2));
        listener = new CalculatorTestListener();
        notifier.addListener(listener);

    }

    @After
    public void afterTest() {
        System.out.println("After: обнуляем переменную калькулятора");
        calculator = null;

    }

}
