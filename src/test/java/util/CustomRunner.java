package util;

import listeners.LoggingListener;
import org.testng.TestNG;

import java.util.Collections;

public class CustomRunner {
    public static void main(String[] args) {

        TestNG testNG=new TestNG();
        testNG.setTestSuites(Collections.singletonList("src/test/resources/testng.xml"));
        testNG.addListener(new LoggingListener());
        testNG.run();
    }
}
