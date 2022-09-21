package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_FirstClass {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("");

        driver.getCurrentUrl();

        driver.manage().window().maximize();

        driver.getTitle();

        driver.getPageSource();

        driver.getWindowHandle();

        driver.navigate();

        driver.quit();

        driver.close();

        driver.wait();
    }
}
