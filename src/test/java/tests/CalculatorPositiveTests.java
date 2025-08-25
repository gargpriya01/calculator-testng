package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorPositiveTests extends BaseTest {

    @Test(groups="smoke")
    public void testAddition(){
        double sum= calc.add(2,4);
        Assert.assertEquals(sum,6);
    }

    @Test(groups = {"arith"})
    public void testSubtraction(){
        Assert.assertEquals(calc.subtract(10, 4), 6.0);
    }

    @Test(groups = {"arith"})
    public void testMultiplication() {
        Assert.assertEquals(calc.multiply(1.5, 2), 3.0);
    }

    @Test(groups = {"arith"})
    public void testDivision() {
        Assert.assertEquals(calc.divide(9, 3), 3.0);
    }

    @Test(groups = {"transcendental"})
    public void testPow() {
        Assert.assertEquals(calc.pow(2, 8), 256.0);
    }

    @Test(groups = {"transcendental"})
    public void testSqrt() {
        Assert.assertEquals(calc.sqrt(81), 9.0);
    }
}
