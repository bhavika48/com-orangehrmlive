import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Orange_2_multiBrowser {
    static String browser = "Edge";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("wrong browser name");
        }
        // get url
        System.out.println("baseurl" + baseUrl);
        driver.get(baseUrl);

        // Print title
        String title = driver.getTitle();
        System.out.println(title);

        // print current Url
        System.out.println(" Current Url :" + driver.getCurrentUrl());

        // Print the page source
        System.out.println("page source :" + driver.getPageSource());

        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Enter username into username field
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("ann123");

        // Enter password into password field
        driver.findElement(By.name("password")).sendKeys("123456");

        // close the Browser
        driver.close();
    }
}
