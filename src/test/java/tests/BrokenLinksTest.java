package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinksTest {

    @Test
    public void validateBrokenLinks() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/broken");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total Links: " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url == null || url.isEmpty())
                continue;
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int responseCode = connection.getResponseCode();
            System.out.println(url + " → " + responseCode);
            Assert.assertTrue(responseCode < 400, "Broken link found: " + url);

        }
        driver.quit();
    }


}
