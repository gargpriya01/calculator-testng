package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorNegativeTests extends BaseTest {

    @Test(groups={"errors"},expectedExceptions = ArithmeticException.class)
    public void testDivideByZero(){
      calc.divide(10,0);
    }

    @Test(groups = {"errors"},expectedExceptions = IllegalArgumentException.class)
    public void testSqrtNegative() {
        calc.sqrt(-1);
    }

    @Test(groups = {"errors"})
    public void testAddInfinityPropagation() {
        double res=calc.add(Double.MAX_VALUE,Double.MAX_VALUE);
        Assert.assertTrue(Double.isInfinite(res) || Double.isNaN(res));
    }

    @Test
    public void testWrongSubtraction() {
        Assert.assertNotEquals(calc.subtract(5, 2), 10.0);
    }

    @Test
    public void testWrongMultiplication() {
        Assert.assertNotEquals(calc.multiply(3, 3), 8.0);
    }

}
