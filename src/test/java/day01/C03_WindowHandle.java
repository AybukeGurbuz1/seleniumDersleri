package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        System.out.println(driver.getWindowHandle()); // CDwindow-E87B14C9EC532DBFAD16DBB5E1EFBAFF
        // farklı pencereler arasında gezinebilmek için
    }
}
