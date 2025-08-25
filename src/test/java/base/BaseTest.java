package base;

import com.acme.calc.Calculator;
import org.testng.annotations.*;

public class BaseTest {
    protected Calculator calc;


    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        System.out.println("[BeforeSuite] Initialize global resources");
    }


    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        System.out.println("[AfterSuite] Cleanup global resources");
    }


    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        System.out.println("[BeforeClass] Create calculator instance for " + getClass().getSimpleName());
        calc = new Calculator();
    }


    @AfterClass(alwaysRun = true)
    public void afterClass() {
        System.out.println("[AfterClass] Tear down for " + getClass().getSimpleName());
    }


    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("[BeforeMethod] Starting test method");
    }


    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("[AfterMethod] Finished test method");
    }

}
