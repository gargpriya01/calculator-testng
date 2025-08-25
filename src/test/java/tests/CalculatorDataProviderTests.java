package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorDataProviderTests extends BaseTest {

    @DataProvider(name = "add-cases", parallel = true)
    public Object[][] addCases() {
        return new Object[][]{{0,0,0},{1.2,3.8,5.0},{-5,5,0},{1e9,1e9,2e9},{-2.5,-2.5,-5.0}};
    }

    @Test(dataProvider = "add-cases", groups = {"arith", "datadriven"})
    public void testAddDataDriven(double a, double b, double expected) {
        Assert.assertEquals(calc.add(a, b), expected, 1e-9);
    }

    @DataProvider(name = "div-bad-inputs")
    public Object[][] divBadInputs() {
        return new Object[][]{ {10,0}, {-5,0} };
    }

    @Test(dataProvider = "div-bad-inputs", expectedExceptions = ArithmeticException.class, groups = {"errors", "datadriven"})
    public void testDivideByZeroDataDriven(double a, double b) {
        calc.divide(a, b);
    }
}
