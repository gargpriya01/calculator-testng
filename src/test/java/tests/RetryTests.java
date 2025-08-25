package tests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTests {

    @Test
    public void test1() {
        Assert.assertTrue(true, "This test will always pass");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void test2() {
        Assert.fail("This test will always fail");
    }

    private static int counter = 0;

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void test3() {
        counter++;
        if (counter < 2) {
            Assert.fail("Failing first attempt");
        }
        Assert.assertTrue(true, "Pass on retry");
}}
