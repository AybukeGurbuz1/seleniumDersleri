package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        //driver.navigate().to() methodu sayfada ileri geri yapacaksak kullanılır
        //driver.get() methodu gibi bizi istediğimiz url e götürür
        driver.navigate().to("https://techproeducation");
        // tekrar amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back();
        // tekrar techproed sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
        //Techproed sayfasını yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();
        //Son olarak sayfayı kapatınız
        driver.close();


    }
}
