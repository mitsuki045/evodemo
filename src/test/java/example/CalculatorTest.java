package example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testIsPositive() {
        Calculator calc = new Calculator();
        assertTrue(calc.isPositive(10));
    }
}
