package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    public static final int maxCount=3;
    private int count=0;

    public boolean retry(ITestResult result){
        if(count<maxCount){
            count++;
           System.out.println("Retrying test: " + result.getName() + " | Attempt " + (count + 1));
            return true;
        }
        return false;
    }
}
