import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Orange_2 {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        // Launch the browser
        WebDriver driver = new ChromeDriver();

        // open url into browser
        driver.get(baseurl);

        //  print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // print current Url
        System.out.println("Current url : " + driver.getCurrentUrl());

        // print the page source code
        System.out.println("Page source : " + driver.getPageSource());

        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Enter the username to username  field
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("ann123");


        // Enter password to password field
        driver.findElement(By.name("password")).sendKeys("123456");

        // close the browser
        driver.close();

    }
}
